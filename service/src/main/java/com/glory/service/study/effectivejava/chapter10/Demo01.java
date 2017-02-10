package com.glory.service.study.effectivejava.chapter10;

import java.util.concurrent.TimeUnit;

/**
 * Created by yangch on 2016/11/10 0010.
 */
public class Demo01 {
    private volatile static boolean flag;

    //    private static synchronized void setFlag(){
//        flag=true;
//    }
//    private static synchronized boolean getFlag(){
//        return flag;
//    }
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(System.currentTimeMillis());
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!flag) {
                    i++;
                }
                //System.out.println(System.currentTimeMillis());
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        //setFlag();
        flag = true;
    }
}
