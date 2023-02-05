package com.example.springapp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.College;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<College> getCollege() {
        
        College college = new College();

        college.setCollegeName("Sri Krishna");
        college.setDepartmentName("ECE");
        college.setSection(2);

        return new ResponseEntity<College>(college, HttpStatus.OK);
    }
    
}
