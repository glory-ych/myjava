package com.glory.service.study.proxy.review1130;

import com.glory.service.study.proxy.Student;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import com.glory.service.study.proxy.Student;

import java.lang.reflect.Method;

/**
 * Created by yangch on 2016/11/30 0030.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o,objects);
    }

    public static Student newInstance(Class clazz){
        Enhancer enhancer=new Enhancer();
        enhancer.setCallback(new MyMethodInterceptor());
        enhancer.setSuperclass(clazz);
        return (Student) enhancer.create();
    }
}
