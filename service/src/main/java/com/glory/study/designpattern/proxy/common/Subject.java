package com.glory.study.designpattern.proxy.common;

/**
 * Created by yangch on 2016/10/13.
 */
public class Subject implements ISubject {
    @Override
    public void action() {
        System.out.println("subject...");
    }

}
