package com.glory.service.study.designpattern.thread;

import org.junit.Test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by yangch on 2016/10/18.
 */
public class Main {
    public static volatile int age = 0;

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(age++);
//                }
//            }).start();
//        }

    }

    public static void change() {
        System.out.println(Thread.currentThread().getName() + "..." + age++);
    }

    @Test
    public void demo03() {
        HashMap map = new HashMap();
        map.put("name", "ych");
        Hashtable table = new Hashtable();
        table.put("name", "sst");
        Enumeration enumeration = table.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
//        Iterator<HashMap.Entry> it1 = com.glory.study.map.entrySet().iterator();
//        while (it1.hasNext()) {
//            HashMap.Entry entry = it1.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }

    @Test
    public void demo02() {
        //Thread com.glory.thread=new MyThread();
        //com.glory.thread.start();
//        MyRunnable myRunnable=new MyRunnable();
//        Thread com.glory.thread=new Thread(myRunnable);
//        com.glory.thread.start();

        MyRunnable myThread = new MyRunnable();
        Thread t = new Thread(myThread);
        t.start();
    }

    @Test
    public void demo01() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i == 10) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("daemon..." + i);
                }
            }
        });
        t1.start();
        t1.setDaemon(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++)
                    System.out.println("non daemon..." + i);
            }
        }).start();

    }
}
