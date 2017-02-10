package com.glory.service.study.thread;

/**
 * Created by yangch on 2016/12/2 0002.
 */
public class MyThread extends Thread {
    private int num = 10;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (this.num > 0) {
                System.out.println("com.glory.thread...线程..." + Thread.currentThread().getName() + "卖票..." + num--);
            }
        }
    }
}
