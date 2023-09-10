package com.lethy.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"
    @Value("${developer.name}")
    String developerName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello " + developerName + "!";
    }
}
