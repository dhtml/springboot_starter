package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot 🚀";
    }

    @GetMapping("/user")
    public Map<String, String> user() {
        return Map.of("name", "Tony", "role", "Developer");
    }

    @GetMapping("/user/{name}")
    public String getUser(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/about")
    public String about() {
        return "This is the about page";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact us";
    }

    @GetMapping("/help")
    public String help() {
        return "Help me";
    }


    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name;
    }
}