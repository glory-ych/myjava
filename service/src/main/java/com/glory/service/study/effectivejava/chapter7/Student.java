package com.glory.service.study.effectivejava.chapter7;

import java.io.Serializable;

/**
 * Created by yangch on 2016/11/4 0004.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -5825267026271435260L;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
