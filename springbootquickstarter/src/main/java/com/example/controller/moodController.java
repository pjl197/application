package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author p
 */
@RestController
public class moodController {
    @Value("${my.mood.today}")
    private String today;

    @Value("${my.mood.content}")
    private String content;

    @Value("${my.mood.author}")
    private String author;

    @GetMapping("/mood")
    public String getMood() {

        return "Today is " + today + " and the mood is " + content + " - " + author;
    }
}
