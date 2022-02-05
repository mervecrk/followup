package com.bilgeadam.springbootornek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrnekController {

   @GetMapping("/hosgeldin")
    public String merhaba()
    {
        return "Merhaba Spring Boot";
    }

    @PostMapping("/ugurla")
    public String guleGule()
    {
        return "Hoşçakal Spring Boot";
    }
}
