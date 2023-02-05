package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/")
    public String getName() {

        String name = "IamNeo";

        return "Welcome "+ name + "!";
    }
}
