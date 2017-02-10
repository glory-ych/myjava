package com.glory.service.study.thread;

import com.glory.service.study.proxy.Student;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/**
 * Created by yangch on 2016/12/2 0002.
 */
public class Main1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return 1;
            }
        });

        try {
            System.out.println(future.get());
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();
    }

    @Test
    public void test03() {
        final ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setNameFormat("Orders-%d")
                .setDaemon(true)
                .build();
        final ExecutorService executorService = Executors.newFixedThreadPool(5, threadFactory);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "..." + System.currentTimeMillis() + "...daemon..." + Thread.currentThread().isDaemon());
                }
            });
        }
    }

    @Test
    public void test02() {
        MyRunnable myRunnable = new MyRunnable();
        for (int i = 0; i < 3; i++) {
            new Thread(myRunnable).start();
        }
    }

    @Test
    public void test01() {
        for (int i = 0; i < 3; i++) {
            new MyThread().start();
        }
    }

    private Student student;

    private void dcl() {
        if (student == null) {
            synchronized (this) {
                if (student == null) {
                    student = new Student();
                }
            }
        }

    }
}
