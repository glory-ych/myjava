package com.glory.service.study.other;

import org.apache.log4j.LogManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class Main6 {
    LogManager logManager = null;

    @Test
    public void demo05() {
        System.out.println(CouponUserStatus.ALL.value);

    }

    enum CouponUserStatus {
        UNUSED(0), USERD(1), ALL(-1);
        int value;

        CouponUserStatus(int value) {
            this.value = value;
        }
    }

    @Test
    public void demo04() {
        Long[] arr = new Long[2];
        System.out.println(arr == null);
    }

    @Test
    public void demo03() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    @Test
    public void demo02() {
        List<People> list = new ArrayList<>();
        list.add(new People("a", 1));
        list.add(new People("c", 3));
        list.add(new People("b", 2));
        System.out.println("zheng:" + list);
        Collections.reverse(list);
        System.out.println("fan:" + list);
    }

    @Test
    public void demo01() {
        List<People> list = new ArrayList<>();
        list.add(new People());
        list.add(null);
        list.add(new People());
        Map<String, String> map = new HashMap<>();
        System.out.println(list.get(0).getName() == null);
        if (!map.containsKey(list.get(0).getName())) {
            String str = map.get(list.get(0).getName());
            System.out.println(str);
        }
//        System.out.println(map.containsKey(list.get(0).getName()));
//        System.out.println(list.size());
//        for (People people : list) {
//            System.out.println(people);
//        }
    }
}
