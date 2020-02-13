package com.bridgelabz.demo.com.bridgelabz.demo.practice;

import com.bridgelabz.demo.annotations.EmployeeCourse;
import com.bridgelabz.demo.models.Employee;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EmployeeDemo {

    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("1", "Jaspreet", "Mumbai");
        employee.getEmployeeDetails();

        Class classObject = employee.getClass();
        Method method = classObject.getMethod("getEmployeeDetails");
        Annotation annotation = method.getAnnotation(EmployeeCourse.class);
        EmployeeCourse studentCourse = (EmployeeCourse) annotation;

        System.out.println("------------------------------");
        System.out.println("EMPLOYEE COURSE DETAILS");
        System.out.println("COURSE ID : "+ studentCourse.courseId());
        System.out.println("COURSE NAME : "+ studentCourse.courseName());
        System.out.println("COURSE COST : "+ studentCourse.courseCost());
        System.out.println("------------------------------");
    }
}
