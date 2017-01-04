package com.glory.study.designpattern.proxy.cglib;

/**
 * Created by yangch on 2016/10/13.
 */
public class Main {
    public static void main(String[] args) {
        CglibSubject cglibSubject=new CglibSubject();
        MyMethodInterceptor interceptor = new MyMethodInterceptor();
        CglibSubject subject = interceptor.getInstance(cglibSubject);
        subject.action();
    }
}
