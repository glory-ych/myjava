package com.glory.service.study.designpattern.adapter;

/**
 * Created by yangch on 2016/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        IPig adapter = new Adapter(dog, cat);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "..." + adapter.getName());
        }
    }
}
