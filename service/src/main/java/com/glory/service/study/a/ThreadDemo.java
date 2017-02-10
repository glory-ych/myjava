package com.glory.service.study.a;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yangch on 2017/1/11 0011.
 */
public class ThreadDemo {
    @Test
    public void demo02(){

    }


    private static volatile List<Integer> list = new ArrayList<>();
    private volatile Map<Integer,String> map= new ConcurrentHashMap<>();
    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.test02();
    }
    public void test02(){
        Random random=new Random();
        for (int i=0;i<10;i++){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    //System.out.println(Thread.currentThread().getName()+"...start..."+map.size());
                    int rand=random.nextInt(100);
                    System.out.println(rand);
                    if(!map.containsKey(rand)){
                        map.put(rand,Thread.currentThread().getName());
                    }
                    //System.out.println(Thread.currentThread().getName()+"...end..."+map.size());
                }
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("size..."+map.size());
    }
    public void test01() throws InterruptedException{
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "..." + list + "..." + System.currentTimeMillis());
                }
            }).start();
        }
        Thread.sleep(1000);
        list.remove(1);
        Thread.sleep(1000);
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "..." + list+ "..." + System.currentTimeMillis());
                }
            }).start();
        }
    }
    @Test
    public void demo01() {

    }
}
