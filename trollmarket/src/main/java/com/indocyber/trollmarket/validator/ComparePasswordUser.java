package com.indocyber.trollmarket.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ComparePasswordValidatorUser.class)
public @interface ComparePasswordUser {
    String message() default "Password doesn't match";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
