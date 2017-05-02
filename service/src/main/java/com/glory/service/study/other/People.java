package com.glory.service.study.other;

/**
 * Created by yangch on 2016/11/8 0008.
 */
public class People implements Comparable {
    public static void main(String[] args) {
        People p = new People();
        People p1 = new People();
        System.out.println(p);
//        p.print();
        p1.say();
    }

    private void say() {
        System.out.println(People.this);
//        People.this.print();
    }

    private String name;
    private Integer age;

    public People() {
    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
        System.out.println("people print..." + this);
    }


//    @Override
//    public String toString() {
//        return age != null ? this.getAge().toString() : "";
//    }

    @Override
    public int compareTo(Object o) {
        People people = (People) o;
        return this.getAge().compareTo(people.getAge());
    }
}
