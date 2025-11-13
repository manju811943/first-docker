package com.docker_test.docker_test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class testController {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to Bangalore HI hello";
    }

}
