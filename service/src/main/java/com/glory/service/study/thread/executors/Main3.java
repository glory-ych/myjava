package com.glory.service.study.thread.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by yangch on 2017/1/18 0018.
 */
public class Main3 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++ ) {
            pool.execute(new MyTask(i));
        }
        //pool.shutdown();
        //test4();
        //System.out.println((6 - 1) / 5 + 1);
    }

    private static void test5() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(i);
                        if (i == 5) {
                            throw new RuntimeException("ext");
                        }
                    } catch (Exception e) {

                    }

                }
            }
        });
    }

    private static int num = 0;

    private static void test4() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 8; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Random random = new Random();
                    int ran = random.nextInt(1000);
                    System.out.println(Thread.currentThread().getName() + "..." + ran);
                    if (ran > 900) {
                        throw new RuntimeException(Thread.currentThread().getName() + " exception");
                    }
                    try {
                        Thread.sleep(Long.valueOf(ran));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
    }

    private static void test3() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Callable<Integer>> tasks = new ArrayList<>();
        Callable<Integer> task;
        for (int i = 0; i < 10; i++) {
            task = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return new Random().nextInt(1000);
                }
            };
            tasks.add(task);
        }
        List<Future<Integer>> list = executorService.invokeAll(tasks);
        for (Future<Integer> future : list) {
            System.out.println(future.get());
        }
    }

    private static void test2() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        BlockingQueue<Future<Integer>> blockingQueue = new LinkedBlockingDeque<>(10);
        CompletionService completionService = new ExecutorCompletionService(executorService, blockingQueue);
        //提交任务
        for (int i = 0; i < 10; i++) {
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int ran = new Random().nextInt(1000);
                    System.out.println(ran);
                    Thread.sleep(ran);
                    return ran;
                }
            });
        }
        //获取返回结果
        for (int i = 0; i < 10; i++) {
            Future<Integer> f = completionService.take();
            System.out.println(Thread.currentThread().getName() + "..." + f.get());
        }
        executorService.shutdown();
    }

    private static void test() {
        /**
         * 内部维护11个线程的线程池
         */
        ExecutorService exec = Executors.newFixedThreadPool(11);
        /**
         * 容量为10的阻塞队列
         */
        final BlockingQueue<Future<Integer>> queue = new LinkedBlockingDeque<Future<Integer>>(
                10);
        //实例化CompletionService
        final CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(
                exec, queue);

        /**
         * 模拟瞬间产生10个任务，且每个任务执行时间不一致
         */
        for (int i = 0; i < 10; i++) {
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int ran = new Random().nextInt(1000);
                    Thread.sleep(ran);
                    System.out.println(Thread.currentThread().getName()
                            + " 休息了 " + ran);
                    return ran;
                }
            });
        }

        /**
         * 立即输出结果
         */
        for (int i = 0; i < 10; i++) {
            try {
                //谁最先执行完成，直接返回
                Future<Integer> f = completionService.take();
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        exec.shutdown();
    }

    static class MyTask implements Runnable {
        private int num;

        public MyTask(int index) {
            this.num = index;
        }

        public void run() {
            try {
                Thread.sleep(5000L);
                System.out.println("task " + num + " executed by " + Thread.currentThread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num < 5) {
                throw new RuntimeException("task " + num + ",executed by " + Thread.currentThread());
            }
        }
    }
}
