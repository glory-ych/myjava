package com.glory.service.study.designpattern.proxy.cglib;

/**
 * Created by yangch on 2016/10/13.
 */
public class CglibSubject {
    public static void main(String[] args) {
        //CglibSubject cglibSubject=new CglibSubject();
        //cglibSubject.action();
        MyMethodInterceptor interceptor = new MyMethodInterceptor();
        CglibSubject subject = interceptor.getInstance();
        subject.action();
        subject.say();
    }

    public void action() {
        System.out.println(this.getClass() + "...cglib...");
    }
    public void say() {
        System.out.println(this.getClass() + "...say...");
    }
}
