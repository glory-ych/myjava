package com.glory.service.study.designpattern.command;

/**
 * Created by yangch on 2016/10/14.
 */
public class ConcreteR1 implements Receiver {

    @Override
    public void operate() {
        System.out.println("r1 operate...");
    }
}
