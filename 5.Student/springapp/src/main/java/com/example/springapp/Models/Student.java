package com.example.springapp.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Student {
    String studentName;
    String message;
}
