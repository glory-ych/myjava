package com.glory.study.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangch on 2016/9/30.
 */
public class ProxyInvotationHandler implements InvocationHandler {
    Object obj;

    public ProxyInvotationHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(obj, args);
    }
}
