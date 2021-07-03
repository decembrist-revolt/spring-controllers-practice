package org.decembrist.controllerspractice;

import org.springframework.stereotype.Controller;

/**
 * Аннотацию менять нельзя
 */
@Controller
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

    // 2
    // Создать метод который возвращает .html страницу с текстом который пользователь отправляет в запросе
    // Путь запроса в браузере GET (гугли HTTP METHOD) /controller/html?text={value} (гугли spring RequestParam)
    // Использовать библиотеку freemarker (уже подключена в pom.xml)

    // Пример, пользователь идет в браузере на http://localhost:8080/controller/html?text=j.o.p.a
    // Ответ открывается страница с текстом <h1>Это j.o.p.a</h1> (тэг h1 необязателен, можно заменить любым другим)
    // Если пользователь не указывает параметер text, то используется значение для text по умолчанию "zbs"
}
