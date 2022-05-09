package com.example.springtemplate;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Validated
@CrossOrigin(origins = "*", allowCredentials = "false")
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        logger.info("Get all users:");
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity newUser){
        if (newUser.getId() == null){
            newUser.setId(UUID.randomUUID());
        }

        logger.info("Create user:" + newUser.getId());

        return ResponseEntity.ok(userRepository.save(newUser));
    }

//    @GetMapping()
//    public String voice(){return "here is the gift";}

}
