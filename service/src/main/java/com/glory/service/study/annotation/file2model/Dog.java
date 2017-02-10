package com.glory.service.study.annotation.file2model;

/**
 * Created by yangch on 2016/11/11 0011.
 */
public class Dog {
    @MyAnnotation(name = "pig.age")
    private int age;
    @MyAnnotation(name = "pig.name")
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
