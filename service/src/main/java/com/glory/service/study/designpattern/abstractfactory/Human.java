package com.glory.service.study.designpattern.abstractfactory;

/**
 * Created by yangch on 2016/10/9.
 */
public abstract class Human {
    public Human() {
    }

    public Human(int age) {
        this.age = age;
    }

    public int age;

    public abstract void say();
}
