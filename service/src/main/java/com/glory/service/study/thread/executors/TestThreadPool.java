package com.glory.service.study.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by yangch on 2017/1/22 0022.
 */
public class TestThreadPool {
    private static final ExecutorService pool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            pool.execute(new MyTask(i));
        }

        for (int i = 0; i < 40; i++) {
            System.out.println("poolSize:" + ((ThreadPoolExecutor) pool).getPoolSize());
            Thread.sleep(1000L);
        }
        pool.shutdown();
    }

    static class MyTask implements Runnable {
        private int num;

        public MyTask(int index) {
            this.num = index;
        }

        public void run() {
            System.out.println("task " + num + " executed by " + Thread.currentThread());
//            try {
//                //Thread.sleep(5000L);
//                System.out.println("task " + num + " executed by " + Thread.currentThread());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (num < 5) {
                throw new RuntimeException("task " + num + ",executed by " + Thread.currentThread());
            }
        }
    }
}
