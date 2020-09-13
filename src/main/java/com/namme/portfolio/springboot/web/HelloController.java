package com.namme.portfolio.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "index.html";
    }

    @GetMapping("/api/users")
    public String api() {
        return "users";
    }
}
