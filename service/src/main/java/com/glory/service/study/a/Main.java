package com.glory.service.study.a;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangch on 2017/1/10 0010.
 */
public class Main {
    private static int num = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i);
                if (i == 2) {
                    System.out.println(i / 0);
                }
            } catch (Exception e) {
                System.out.println("exception...");
            }
        }
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName() + "..." + System.currentTimeMillis());
//                }
//            });
//            if (!executorService.isShutdown()) {
//                executorService.shutdown();
//            }
//            Thread.sleep(200);
//        }
    }

    @Test
    public void demo06() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        LinkedList<Integer> diffLinkList = new LinkedList<>(list);
        System.out.println(diffLinkList.pop());
        System.out.println(diffLinkList.pop());
        System.out.println(diffLinkList.pop());

//        List<Integer> subList = list.subList(0, 1);
//        for (Integer integer: subList){
//            System.out.println(integer);
//        }
        System.out.println("**********************");
        System.out.println(diffLinkList.isEmpty());
        for (Integer integer : diffLinkList) {
            System.out.println(integer);
        }
    }

    @Test
    public void demo05() {
        long start = System.currentTimeMillis();
        System.out.println(start);
        while (true) {
            if (System.currentTimeMillis() - start >= 1000) {
                break;
            }
        }
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void demo04() {
        List<String> data = new LinkedList<>();
        data.add(null);
        data.add("abc");
        for (String str : data) {
            System.out.println(str.isEmpty());
        }
    }

    @Test
    public void demo03() {
        List<String> list1 = new ArrayList<>();
        list1.add(null);
        System.out.println(list1.size());
        list1.add("aaa");
        List<String> list2 = new LinkedList<>();
        //list2.add("bbb");
        list2.addAll(null);
        list2.addAll(list1);
        for (String key : list2) {
            System.out.println(key);
        }
    }

    @Test
    public void demo02() {
        List<String> couponSnList = new ArrayList<>();
        couponSnList.add("aaa");
        couponSnList.add(null);
        couponSnList.add("ccc");
        List<String> couponSnKeys = new LinkedList<>();
        for (String couponSn : couponSnList) {
            couponSnKeys.add("key_" + couponSn);
        }
        for (String key : couponSnKeys) {
            System.out.println(key);
        }
        for (int i = 0; i < 1; i++) {
            couponSnKeys.remove(i);
        }
        System.out.println("************");
        for (String key : couponSnKeys) {
            System.out.println(key);
        }
    }

    @Test
    public void demo01() {
        String str = "1,2,3";
        System.out.println(str.matches("^[0-9,]*$"));
    }
}
