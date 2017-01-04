package com.glory.study.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by yangch on 2016/9/12.
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface MyResource {
    //String value() default "";
    //int age();
    //String name();
}
