package com.glory.service.study.annotation.validator;

/**
 * Created by yangch on 2016/9/27.
 */
public class People {
    @PeopleValidtor(emptyable = false, message = "姓名不能空")
    private String name;
    @PeopleValidtor(min = 10, max = 100, message = "年龄在10-100")
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
