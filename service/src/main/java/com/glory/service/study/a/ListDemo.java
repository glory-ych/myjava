package com.glory.service.study.a;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by yangch on 2017/1/11 0011.
 */
public class ListDemo {
    @Test
    public void demo01() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        Set<Integer> set=new HashSet<>(list);
        for (Integer integer: set){
            System.out.println(integer);
        }
    }
}
