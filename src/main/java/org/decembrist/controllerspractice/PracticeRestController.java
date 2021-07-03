package org.decembrist.controllerspractice;

import org.decembrist.controllerspractice.dto.BodyDto;
import org.decembrist.controllerspractice.dto.PathVariableDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Аннотацию менять нельзя
 */
@RestController
@RequestMapping("rest/controller")
public class PracticeRestController {

    //3
    // Создать метод который возвращает json {"path-variable": <значение 'value' из пути запроса>}
    // Путь запроса POST /rest/controller/value (гугли spring PathVariable)

    // Пример: Запрос POST http://localhost:8080/rest/controller/jopka
    // Ответ {"path-variable":"jopka"}
    @PostMapping("/{value}")
    public PathVariableDto pathVariable(@PathVariable String value) {
        return new PathVariableDto(value);
    }

    //4
    // Создать метод который возвращает пустой ответ со статусом 200, при условии
    // Путь запроса PUT /rest/controller/body (гугли spring RequestBody)
    // Тело запроса выглядит {"even-number": <число>}
    // Если <число> четное, то статус ответа 200, иначе статус ответа 400
    // Если тело запроса отсутствует, то ответ все равно 200

    // Пример: Запрос PUT http://localhost:8080/rest/controller/body
    // Ответ 200
    // Пример: Запрос PUT http://localhost:8080/rest/controller/body, тело = {"even-number": 2}
    // Ответ 200
    // Пример: Запрос PUT http://localhost:8080/rest/controller/body, тело = {"even-number": 3}
    // Ответ 400
    @PutMapping("/body")
    public ResponseEntity<?> body(@RequestBody(required = false) BodyDto body) {
        boolean is200Case = body == null || body.getNumber() % 2 == 0;
        return is200Case ? ResponseEntity.ok(null) : ResponseEntity.badRequest().body(null);
    }

}
