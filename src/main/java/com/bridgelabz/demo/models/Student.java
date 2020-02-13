package com.bridgelabz.demo.models;

import com.bridgelabz.demo.annotations.StudentCourse;

@StudentCourse(courseId = "101", courseName = "Java", courseCost = 25000)
public class Student {

    private String id;

    private String name;

    private String address;

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void getStudentDetails() {
        System.out.println("------------------------------");
        System.out.println("STUDENT DETAILS");
        System.out.println("STUDENT ID : "+id);
        System.out.println("STUDENT NAME : "+name);
        System.out.println("STUDENT ADDRESS : "+address);
        System.out.println("------------------------------");
    }
}
