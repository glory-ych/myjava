package com.glory.study.javatest;

/**
 * Created by yangch on 2016/10/8.
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        final ThreadLocal<String> name = new ThreadLocal<String>() {
            @Override
            protected String initialValue() {
                return "default";
            }
        };
        new Thread(new Runnable() {
            public void run() {
                System.out.println("[" + Thread.currentThread().getName() + "],beforename=" + name.get());
                name.set("thread1");
                System.out.println("[" + Thread.currentThread().getName() + "],aftername=" + name.get());
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println("[" + Thread.currentThread().getName() + "],beforename=" + name.get());
                //name.set("thread1");
                //System.out.println("[" + Thread.currentThread().getName() + "],aftername=" + name.get());
            }
        }).start();
    }
}
