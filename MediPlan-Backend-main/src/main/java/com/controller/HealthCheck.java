package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")

public class HealthCheck {
    @GetMapping("/hello")
    public String check(){
        return "this is working";
    }
}
