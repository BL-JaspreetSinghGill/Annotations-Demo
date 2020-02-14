package com.bridgelabz.demo;

import com.bridgelabz.demo.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class UserTest {

    private  Validator validator;

    @Before
    public  void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void givenName_WhenProper_ShouldReturnValueZero() {
        User user = new User(1, "jas");
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
        Assert.assertEquals(constraintViolations.size(), 0);
    }

    @Test
    public void givenName_WhenImproper_ShouldReturnValueOne() {
        User user = new User(1, "a");
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
        Assert.assertEquals(constraintViolations.size(), 1);
    }
}
