package com.glory.service.study.other;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yangch on 2017/3/14 0014.
 */
public class MyInterceptor implements MethodInterceptor {

    public CglibDemo getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibDemo.class);
        enhancer.setCallback(this);
        return (CglibDemo) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after...");
        return result;
    }
}

