package com.example.springapp.Models;

public class Family {
    String name;
    int age;
    String relation;
    public Family() {
    }
    public Family(String name, int age, String relation) {
        this.name = name;
        this.age = age;
        this.relation = relation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getRelation() {
        return relation;
    }
    public void setRelation(String relation) {
        this.relation = relation;
    }

}
