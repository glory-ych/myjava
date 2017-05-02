package com.glory.service.study.thread.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by yangch on 2017/4/24 0024.
 */
public class FutureTaskDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        FutureTask<String> futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println(System.currentTimeMillis());

                System.out.println(System.currentTimeMillis());
                return "hello";
            }
        });
        exec.submit(futureTask);
        try {
//            String result = futureTask.get(2, TimeUnit.SECONDS);
//            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            String result = futureTask.get();
            System.out.println("result..." + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
