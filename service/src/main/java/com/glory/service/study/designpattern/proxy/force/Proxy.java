package com.glory.service.study.designpattern.proxy.force;

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

    @Override
    public ISubject getProxy() {
        return null;
    }
}
