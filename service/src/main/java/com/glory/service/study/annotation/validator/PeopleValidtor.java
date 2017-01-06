package com.glory.service.study.annotation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yangch on 2016/9/27.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@MyAnnotation(valid = PeopleValidtor.class)
public @interface PeopleValidtor {
    String message() default "";

    boolean emptyable() default true;

    int min() default 0;

    int max() default 0;
}
