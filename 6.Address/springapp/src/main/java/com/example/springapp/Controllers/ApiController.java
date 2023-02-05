package com.example.springapp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Address;

@RestController
public class ApiController {
    
    @GetMapping("/address")
    public ResponseEntity<Address> getAddress(){
        Address address = new Address();

        address.setName("IamNeo");
        address.setDoorNo(20);
        address.setStreetName("HTS Street");
        address.setPincode(641037);
        address.setArea("Netaji Road Area");
        address.setDistrict("Coimbatore");
        address.setState("Tamil Nadu");
        address.setCountry("India");

        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }
}
