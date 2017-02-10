package com.glory.service.review.year2016.revi1220;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class LockDemo {
    static Lock lock = new ReentrantLock();// 锁
    static int j = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test();
                }
            }).start();
        }
    }

    private static void test() {
        //lock.lock();
        System.out.println(Thread.currentThread().getName() + "..." + (j++));
        //lock.unlock();
    }
}
