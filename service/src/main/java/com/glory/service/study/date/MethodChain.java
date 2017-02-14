package com.glory.service.study.date;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class MethodChain {
    private String name;
    private int age;
    private String address;

    public int getAge() {
        return age;
    }

    public MethodChain setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public MethodChain setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {

        return name;
    }

    public MethodChain setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return this.getName() + "_" + this.getAge() + "_" + this.getAddress();
    }
}
