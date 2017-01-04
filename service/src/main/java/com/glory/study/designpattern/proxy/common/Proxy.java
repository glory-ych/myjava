package com.glory.study.designpattern.proxy.common;

/**
 * Created by yangch on 2016/10/13.
 */
public class Proxy implements ISubject {
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        System.out.println("com.glory.study.proxy start...");
        subject.action();
        System.out.println("com.glory.study.proxy end...");
    }

}
