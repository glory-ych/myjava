package com.glory.service.study.a;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yangch on 2017/1/11 0011.
 */
public class StringDemo {
    @Test
    public void demo01() {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10000; i++) {
            list.add(i);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        while (list.size()>0){

        }
    }
}
