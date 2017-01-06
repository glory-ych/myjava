package com.glory.service.study.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangch on 2016/10/13.
 */
public class DynamicProxy implements InvocationHandler {

    private DynamicSubject subject;

    public DynamicProxy(DynamicSubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(subject, args);
    }
}
