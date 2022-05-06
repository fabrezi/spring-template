package com.example.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class greetingcontrolla {

    private static final String tame = "Hello,%s:";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "id", defaultValue = "World") String name) {
        return new Greeting(1, "your mama");
    }
}
