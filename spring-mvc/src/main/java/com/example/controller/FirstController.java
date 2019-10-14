package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class FirstController {

    @GetMapping("/url1")
    public String handleRequest() {

        return "Hello, world!";
    }

    @GetMapping("/url2")
    public String handleRequestWithName(@RequestParam(name = "name") String name) {

        return "Hello, " + name;
    }
}
