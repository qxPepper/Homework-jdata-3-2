package ru.netology.homeworkjdata43.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.homeworkjdata43.service.MyService;

import java.util.List;

@RestController
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/persons/by-city")
    public List<String> getPersonsByCity(@RequestParam(value = "city") String city) {
        return myService.getPersonsByCity(city);
    }
}
