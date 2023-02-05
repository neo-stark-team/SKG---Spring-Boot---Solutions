package com.example.springapp.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Student;

@RestController
public class ApiController {

    // Sen - 1
    @GetMapping("/welcome")
   public ArrayList<Student> getWelcomeMessage(){

        ArrayList<Student> details = new ArrayList<>();

        Student one = new Student();

        one.setStudentName("Kumar");
        one.setMessage("Hello String Boot!");

        details.add(one);

        return details;
    }
}