package ru.study.model.controller;

import jakarta.validation.Valid;
import ru.study.model.request.RequestExample;
import ru.study.model.response.ResponseExample;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample {

    @PostMapping("/")
    public String sayHello() {
        return "Hello World!";
    }


    @PostMapping("/annotation")
    public ResponseExample someAnnotation(@Valid RequestExample request) {
        return new ResponseExample("Hello people!");
    }
}
