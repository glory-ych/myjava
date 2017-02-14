package com.glory.service.study.other;

/**
 * Created by yangch on 2016/11/8 0008.
 */
public class People {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void get() {
        System.out.println("people get...");
        this.print();
    }

    public void print() {
        System.out.println("people print...");
    }
}
