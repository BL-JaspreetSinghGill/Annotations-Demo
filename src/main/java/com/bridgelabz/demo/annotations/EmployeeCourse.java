package com.bridgelabz.demo.annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType. METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeCourse {

    String courseId() default "000";
    String courseName() default "C Programming Language";
    int courseCost() default 10000;
}
