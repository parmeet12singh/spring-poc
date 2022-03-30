package com.example.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    // private final MessageProperties properties;

    // public HelloController(MessageProperties properties) {
    //     this.properties = properties;
    // }
    
    @Autowired
    MessageProperties config;
    @Autowired
    MyConfiguration vault;


    // @GetMapping
    @RequestMapping("/")
    public String getMessage() {
        // return "Message: " + config.getMessage();

        String message = "Username: " + vault.getUsername() + "\nPassword: " + vault.getPassword() + "\nMessage: " + config.getMessage();
        return message;
    }
}