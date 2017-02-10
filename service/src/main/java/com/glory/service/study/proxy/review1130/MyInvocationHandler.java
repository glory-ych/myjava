package com.glory.service.study.proxy.review1130;


import com.glory.service.study.proxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangch on 2016/11/30 0030.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Student student;

    public MyInvocationHandler(Student student) {
        this.student = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxy, args);
    }
}
