package com.glory.service.study.effectivejava.chapter3;

import java.io.Serializable;

/**
 * Created by yangch on 2016/10/15.
 */
public final class Student implements Cloneable,Serializable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

//    @Override
//    protected Student clone() throws CloneNotSupportedException {
//        return (Student) super.clone();
//    }
}
