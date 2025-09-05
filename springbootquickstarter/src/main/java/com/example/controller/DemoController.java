package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {
    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
    @GetMapping("/demo2")
    public String demo2() {
        return "demo2";
    }
}
