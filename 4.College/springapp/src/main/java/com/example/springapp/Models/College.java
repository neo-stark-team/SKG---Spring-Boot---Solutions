package com.example.springapp.Models;

public class College {
    String collegeName;
    String departmentName;
    int section;

    public College() {
    }

    public College(String collegeName, String departmentName, int section) {
        this.collegeName = collegeName;
        this.departmentName = departmentName;
        this.section = section;
    }
    
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public int getSection() {
        return section;
    }
    public void setSection(int section) {
        this.section = section;
    }

    
}
