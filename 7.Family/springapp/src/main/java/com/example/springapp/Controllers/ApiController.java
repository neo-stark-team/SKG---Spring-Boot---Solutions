package com.example.springapp.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Family;

@RestController
public class ApiController {
    
    @GetMapping("/")
    public ArrayList<Family> getFamilyDetails(){
        ArrayList<Family> familyList = new ArrayList<Family>();

        Family mem1 = new Family();

        mem1.setName("Arun");
        mem1.setAge(23);
        mem1.setRelation("Friend");

        Family mem2 = new Family();

        mem2.setName("Kumar");
        mem2.setAge(23);
        mem2.setRelation("Friend");

        familyList.add(mem1);
        familyList.add(mem2);

        return familyList;
    }
}
