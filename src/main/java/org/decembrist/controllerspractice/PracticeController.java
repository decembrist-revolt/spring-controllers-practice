package org.decembrist.controllerspractice;

import org.decembrist.controllerspractice.dto.RandomValueDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Аннотацию менять нельзя
 */
@Controller
@RequestMapping("/controller")
public class PracticeController {

    // 1
    // Создать метод который возвращает json {"randomValue": <рандомное значение типа int>}
    // Путь запроса в браузере метод GET (гугли HTTP METHOD) /controller/random

    // Пример, пользователь идет в браузере на http://localhost:8080/controller/random
    // Ответ типа application/json (см. заголовок "content-type") с текстом {"randomValue": 2}
    // Пример, пользователь идет в браузере на http://localhost:8080/controller/random
    // Ответ типа application/json (см. заголовок "content-type") с текстом {"randomValue": 3}
    // Пример, пользователь идет в браузере на http://localhost:8080/controller/random
    // Ответ типа application/json (см. заголовок "content-type") с текстом {"randomValue": 1}
    // ...
    @ResponseBody
    @GetMapping("/random")
    public RandomValueDto randomValue() {
        return new RandomValueDto(ThreadLocalRandom.current().nextInt());
    }

    // 2
    // Создать метод который возвращает .html страницу с текстом который пользователь отправляет в запросе
    // Путь запроса в браузере GET (гугли HTTP METHOD) /controller/html?text={value} (гугли spring RequestParam)
    // Использовать библиотеку freemarker (уже подключена в pom.xml)

    // Пример, пользователь идет в браузере на http://localhost:8080/controller/html?text=j.o.p.a
    // Ответ открывается страница с текстом <h1>Это j.o.p.a</h1> (тэг h1 необязателен, можно заменить любым другим)
    // Если пользователь не указывает параметер text, то используется значение для text по умолчанию "zbs"
    @GetMapping("/html")
    public String htmlTemplate(@RequestParam(required = false) String text,
                               Model model) {
        model.addAttribute("text", text != null ? text : "zbs");
        return "template";
    }
}
