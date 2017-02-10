package com.glory.service.study.thread.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yangch on 2017/1/19 0019.
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println("start..." + System.currentTimeMillis());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L);
                    demo02();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("end..." + System.currentTimeMillis());
//        List<Integer> list=new LinkedList<>();
//        for (int i=0;i<20000;i++){
//            list.add(i);
//        }
//        System.out.println(list.size());
//        Map<String,List<Integer>> map=new ConcurrentHashMap<>();
//        map.put("user",list);
//        List<Integer> list1=map.get("user");
//        List<Integer> list2=map.get("user");

//        Main4 main4 = new Main4();
//        main4.demo01();
    }

    private static void demo02() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "..." + System.currentTimeMillis());
                }
            });
        }
        executorService.shutdown();
    }

    private void demo01() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletionService completionService = new ExecutorCompletionService(executorService);
        for (int i = 0; i < 3; i++) {
            completionService.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    return Thread.currentThread().getName();
                }
            });
        }

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(completionService.take().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }


}
