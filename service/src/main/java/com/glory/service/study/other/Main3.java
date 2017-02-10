package com.glory.service.study.other;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by yangch on 2017/1/19 0019.
 */
public class Main3 {
    @Test
    public void demo03() {
        //1482574100769
        //1488384000
        List<Long> list = new LinkedList<>();
        list.add(1485332799L);//2017-01-25 16:26:39
        list.add(1485220799L);//2017-01-24 09:19:59
        list.add(1485120799L);//2017-01-23 05:33:19
        list.add(1484120799L);//2017-01-11 15:46:39
        list.add(1473120799L);//2016-09-06 08:13:19
        Iterator<Long> iterator = list.iterator();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -30);//30天前的当前时间
        System.out.println(list);
        while (iterator.hasNext()) {
            if (iterator.next() < cal.getTime().getTime() / 1000) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void demo02() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, -30);
        System.out.println(cal.getTime().getTime());
        System.out.println(format.format(cal.getTime()));
    }

    @Test
    public void demo01() {
        Long num = null;
        System.out.println(num * 20);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(model -> System.out.println(model));
        Main3 main3 = new Main3();
        main3.print(list);
        Future future = null;
//        main3.print(1L,2L);
    }

    private void print2(int i) {
        System.out.println(i);
    }

    private void print(List<Integer> list) {
        list.parallelStream().forEach(this::print2);
    }

    private void print(Long... param) {
        System.out.println(param.getClass());
        for (Long p : param) {
            System.out.println(p == null);
        }
    }
}
