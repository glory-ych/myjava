package com.glory.service.study.other;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yangch on 2017/2/7 0007.
 */
public class Main4 {
    private static Map<String, Integer> map = new ConcurrentHashMap<>();
    private static final int size = 20;

    static {
        map.put("size", 20);
    }

    public static void main(String[] args) {
        Float str=null;
        System.out.println(str.toString());
        //System.out.println(0f);
        //System.out.println("start..." + System.currentTimeMillis());
        //met1();
    }

    public static void met1() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = 0;
                    do {
                        j++;
//                        System.out.println(map.get("size"));
                        map.get("size");
                    } while (j < 10000);
                    System.out.println("end..." + Thread.currentThread().getName() + "..." + System.currentTimeMillis());
                }
            });
            thread.start();
        }
        //1486434945471   1486434945459
    }

    public static void met2() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = 0;
                    do {
                        j++;
                        System.out.println(size);
                    } while (j < 100);
                    System.out.println("end..." + Thread.currentThread().getName() + "..." + System.currentTimeMillis());
                }
            });
            thread.start();
        }
        //1486435054673  1486435054662
    }
}
