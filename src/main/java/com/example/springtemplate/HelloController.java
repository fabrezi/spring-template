package com.example.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

import java.util.List;

@RestController
public class HelloController {
    //private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/hello")
    String hello(){
        return "Good Morning Sunshine!";
    }

    @GetMapping("/v1")
    public String job(){return "yahbadadoo";}

//    @GetMapping("/v2")
//    public Users getUsers(){
//
//    }






}
