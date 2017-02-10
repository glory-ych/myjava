package com.glory.service.study.thread.executors;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by yangch on 2017/1/17 0017.
 */
public class Main2 {
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);
    private static List<Integer> resList = new CopyOnWriteArrayList<>();
    private static int num = 0;

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.test02();
//        System.out.println("start..." + System.currentTimeMillis() / 1000);
//        main2.result();
    }

    private void test02() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    getNum();
                }
            }).start();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("num..." + num);
    }

    private void test01() {
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    print();
                }
            });
        }
        System.out.println(executorService);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        threadPoolExecutor.setMaximumPoolSize(5);
        System.out.println(threadPoolExecutor);
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    print();
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private List<Integer> cal() {
        if (!resList.isEmpty()) {
            resList.clear();
        }
        Future<Integer> future = null;
        for (int i = 0; i < 10; i++) {
            future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 12;
                }
            });
        }
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return resList;
    }

    private List<Integer> result() {
        ThreadPoolExecutor threadPoolExecutor = null;
        if (!resList.isEmpty()) {
            resList.clear();
        }
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    exec();
                    try {
                        TimeUnit.SECONDS.sleep(20L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
//        try {
//            executorService.shutdown();
//            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
//                executorService.shutdownNow();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            executorService.shutdownNow();
//        }
        System.out.println("end..." + System.currentTimeMillis() / 1000);
        return resList;
    }

    private void exec() {
        Random random = new Random();
        resList.add(random.nextInt(10000));
        System.out.println(Thread.currentThread().getName() + "..." + System.currentTimeMillis() / 1000 + "..." + resList);
    }

    private void print() {
        System.out.println(Thread.currentThread().getName() + "..." + System.currentTimeMillis());
    }

    private void test() {
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    pro();
                }
            });
        }
//        try {
//            Thread.sleep(1000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //System.out.println(num);
    }

    private void pro() {
        System.out.println(Thread.currentThread().getName() + "...Num=" + getNum());
    }

    private synchronized int getNum() {
        return num++;
    }
}
