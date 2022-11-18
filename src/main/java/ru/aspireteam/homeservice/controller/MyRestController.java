package ru.aspireteam.homeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/check")
    public String getStartPage(){
        return "Check UP!";
    }
}