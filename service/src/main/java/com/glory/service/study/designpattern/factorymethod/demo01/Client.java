package com.glory.service.study.designpattern.factorymethod.demo01;

/**
 * Created by yangch on 2016/10/20.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory=new Factory1();
        Pizza pizza=factory.create();
        System.out.println(pizza.getClass().getName());
    }
}
