package com.bridgelabz.demo.practice;

import com.bridgelabz.demo.annotations.NameValidator;

import javax.validation.*;

public class NameValidatorImpl  implements ConstraintValidator<NameValidator, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.length() >= 3) {
            return true;
        }
        return false;
    }
}
