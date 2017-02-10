package com.glory.service.study.thread.executors;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by yangch on 2016/11/9 0009.
 */
public class Demo01 {
    @Test
    public void test01() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor threadPoolExecutor = null;
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getId());
                }
            });
        }

    }

    @Test
    public void test02() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

    }

    @Test
    public void test03() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

    }

    @Test
    public void test04() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        //ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor();
        for (int i = 0; i < 20; i++) {
            Runnable syncRunnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            };
            executorService.schedule(syncRunnable, 5000, TimeUnit.MILLISECONDS);
        }

    }

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 2; i++) {
            //System.out.println(i + "..." + Thread.currentThread().getName());
            Runnable syncRunnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "..." + System.currentTimeMillis());
                }
            };
            //executorService.schedule(syncRunnable, 1000, TimeUnit.MILLISECONDS);
            executorService.scheduleAtFixedRate(syncRunnable, 0, 1000L, TimeUnit.MILLISECONDS);
            //executorService.scheduleWithFixedDelay(syncRunnable, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }
}
