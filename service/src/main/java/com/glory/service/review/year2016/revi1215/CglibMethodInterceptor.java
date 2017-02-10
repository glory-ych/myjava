package com.glory.service.review.year2016.revi1215;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yangch on 2016/12/15 0015.
 */
public class CglibMethodInterceptor implements MethodInterceptor {
    CglibSubject subject;

    public CglibSubject getProxy(CglibSubject subject) {
        this.subject = subject;
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(CglibSubject.class);
        return (CglibSubject) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o, objects);
    }

    public static void main(String[] args) {
        CglibMethodInterceptor interceptor = new CglibMethodInterceptor();
        CglibSubject subject = new CglibMethodInterceptor.CglibSubject();
        CglibSubject proxy = interceptor.getProxy(subject);
        System.out.println(proxy);
        proxy.say();

    }


    static class CglibSubject {
        public CglibSubject() {
        }

        public void say() {
            System.out.println(this);
            System.out.println("hello cglib..");
        }
    }
}
