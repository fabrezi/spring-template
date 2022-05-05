package com.example.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello(){
        return "Good Morning Sunshine!";
    }

    private static final String template = "Hello, %s!";

    @GetMapping("/baby")
    public Greeting greeting(@RequestParam(value="name") String name){
        return new greeting(String.format(template,name));
    }


}
