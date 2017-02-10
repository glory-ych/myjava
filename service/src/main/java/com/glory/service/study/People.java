package com.glory.service.study;

/**
 * Created by yangch on 2016/12/30 0030.
 */
public class People {
    public People() {

    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
}
