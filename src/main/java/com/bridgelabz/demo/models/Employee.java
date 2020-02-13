package com.bridgelabz.demo.models;

import com.bridgelabz.demo.annotations.EmployeeCourse;

public class Employee {

    private String id;

    private String name;

    private String address;

    public Employee(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @EmployeeCourse(courseId = "101", courseName = "Java", courseCost = 25000)
    public void getEmployeeDetails() {
        System.out.println("------------------------------");
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("EMPLOYEE ID : "+id);
        System.out.println("EMPLOYEE NAME : "+name);
        System.out.println("EMPLOYEE ADDRESS : "+address);
        System.out.println("------------------------------");
    }
}
