package com.glory.service.study.other;

/**
 * Created by yangch on 2017/3/14 0014.
 */
public class CglibDemo {

    public static void main(String[] args) {
        MyInterceptor myInterceptor = new MyInterceptor();
        CglibDemo proxy = myInterceptor.getInstance();
        proxy.hello();
        proxy.say();
    }

    protected void say() {
        System.out.println(this.getClass() + "...say...");
    }

    protected void hello() {
        System.out.println("hello...");
    }


//    static class Demo implements MethodInterceptor {
//
//        public CglibDemo getInstance() {
//            Enhancer enhancer = new Enhancer();
//            enhancer.setCallback(this);
//            enhancer.setSuperclass(CglibDemo.class);
//            return (CglibDemo) enhancer.create();
//        }
//
//        @Override
//        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//            System.out.println("before...");
//            Object result = methodProxy.invokeSuper(o, objects);
//            System.out.println("after...");
//            return result;
//        }
//    }
}
