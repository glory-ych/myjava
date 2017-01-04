package com.glory.study.other;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by yangch on 2016/9/27.
 */
public class MoneyValidtor implements ConstraintValidator<Money, Double> {
    public void initialize(Money constraintAnnotation) {

    }

    public boolean isValid(Double value, ConstraintValidatorContext context) {
        if (value == null)
            return true;
        return value > 0;
    }
}
