package com.glory.service.study.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yangch on 2016/10/13.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    /**
     * 被代理对象
     */
    //private CglibSubject cglibSubject;

    /**
     * 创建代理对象
     *
     * @param cglibSubject
     * @return
     */
    public CglibSubject getInstance() {
        //this.cglibSubject = cglibSubject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibSubject.class);
        enhancer.setCallback(this);
        return (CglibSubject) enhancer.create();
    }

    /**
     * 回调方法
     *
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before...");
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("after...");
        return object;
    }
}
