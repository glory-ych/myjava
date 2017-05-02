package com.glory.service.study.designpattern.adapter;

import org.junit.Test;

/**
 * Created by yangch on 2016/10/17.
 */
public class Main {
    @Test
    public void test01() {
        Target target = new Adapter();
        target.done();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        IPig adapter = new AnimalAdapter(dog, cat);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "..." + adapter.getName());
        }
    }
}
