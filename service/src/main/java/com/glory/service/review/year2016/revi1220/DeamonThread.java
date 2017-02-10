package com.glory.service.review.year2016.revi1220;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class DeamonThread {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("**********");
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
