package com.glory.service.study.innerclass;

/**
 * Created by yangch on 2016/10/9.
 */
public class Student {
    private int age;
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

    @Override
    public String toString() {
        return "name..." + name + ",age..." + age;
    }
    public Student print() {
        System.out.println("student print");
        return null;
    }

}
