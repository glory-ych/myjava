package com.glory.service.study.other;

import javax.validation.constraints.NotNull;

/**
 * Created by yangch on 2016/9/27.
 */
public class Student<K, V> {
    @NotNull(message = "名称不能为空")
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

    public static <T> T get(String name) {
        return (T) name;
    }

    public K getK(String k) {
        return (K) k;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getK("yyy"));

        System.out.println(Student.get("kus").toString());
    }

    @Override
    public String toString() {
        return this.getName() + "_" + this.getAge();
    }
}
