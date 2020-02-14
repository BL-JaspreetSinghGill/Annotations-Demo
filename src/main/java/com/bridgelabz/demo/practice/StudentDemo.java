package com.bridgelabz.demo.practice;

import com.bridgelabz.demo.annotations.StudentCourse;
import com.bridgelabz.demo.models.Student;

import java.lang.annotation.Annotation;

public class StudentDemo {

    public static void main(String[] args) throws Exception {
        Student student = new Student("1", "Jaspreet", "Mumbai");
        student.getStudentDetails();

        Class classObject = student.getClass();
        Annotation annotation = classObject.getAnnotation(StudentCourse.class);
        StudentCourse studentCourse = (StudentCourse) annotation;

        System.out.println("------------------------------");
        System.out.println("STUDENT COURSE DETAILS");
        System.out.println("COURSE ID : "+ studentCourse.courseId());
        System.out.println("COURSE NAME : "+ studentCourse.courseName());
        System.out.println("COURSE COST : "+ studentCourse.courseCost());
        System.out.println("------------------------------");
    }
}