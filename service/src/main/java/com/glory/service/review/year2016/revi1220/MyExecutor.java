package com.glory.service.review.year2016.revi1220;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class MyExecutor {
    public static void main(String[] args) {
        ExecutorService service1 = Executors.newFixedThreadPool(20);
        ExecutorService service2 = Executors.newCachedThreadPool();
        ExecutorService service3 = Executors.newSingleThreadExecutor();
        ScheduledExecutorService service4 = Executors.newScheduledThreadPool(5);

    }
}
