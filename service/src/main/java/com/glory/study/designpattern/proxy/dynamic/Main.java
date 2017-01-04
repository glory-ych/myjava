package com.glory.study.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by yangch on 2016/10/13.
 */
public class Main {
    public static void main(String[] args) {
        DynamicSubject subject = new DynamicRealSubject();
        System.out.println(subject.getClass().getInterfaces()[0].getName());
        InvocationHandler handler = new DynamicProxy(subject);
        DynamicSubject proxy = (DynamicSubject) Proxy.newProxyInstance(DynamicSubject.class.getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.action();
    }
}
