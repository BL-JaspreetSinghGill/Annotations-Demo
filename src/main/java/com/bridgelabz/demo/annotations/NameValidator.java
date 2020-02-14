package com.bridgelabz.demo.annotations;


import com.bridgelabz.demo.practice.NameValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Inherited
@Documented
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Constraint(validatedBy = NameValidatorImpl.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NameValidator {

    String message() default "PLEASE ENTER VALID MESSAGE";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}