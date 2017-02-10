package com.glory.service.study.other;

import java.util.List;

/**
 * Created by yangch on 2017/2/8 0008.
 */
public class Main5 {
    private static volatile int n = 0;

    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        System.out.println(list.size());
//        add(list);
//        System.out.println(list.get(0));
        incr();
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(n);
    }

    private static void add(List<Integer> list) {
        list.add(1123);
    }

    private static void incr() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "..." + (n++));
                }
            }).start();
        }
    }
}
