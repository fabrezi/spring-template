package com.example.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class greetingcontrolla {

    private static final String tame = "Hello,%s:";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public String word(){return "yo mama";}
}
