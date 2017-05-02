package com.glory.service.study.date;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class CalendarDemo {
    @Test
    public void demo06() {
        int i = 0;
        while (i <= 100) {

            System.out.println(i++);
        }
    }

    @Test
    public void demo05() {
        List<String> list = new ArrayList<>();
        list.add("ych");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("yyy");
        System.out.println(list);
        list = new ArrayList<>();
        System.out.println(list);
    }

    @Test
    public void demo04() {
        System.out.println(String.format("%04d", 1));
        System.out.println(String.format("%04d", 10));
        System.out.println(String.format("%04d", 100));
        System.out.println(String.format("%04d", 1000));
    }

    @Test
    public void demo03() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -40);
        System.out.println(cal.getTime().getTime() / 1000);
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(cal.getTime().getTime() / 1000);

        System.out.println(5 * 24 * 60 * 60);
    }

    @Test
    public void demo02() {
        MethodChain chain = new MethodChain();
        chain.setAge(10).setAddress("address").setName("name");
        System.out.println(chain);
    }

    @Test
    public void demo01() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 0);
    }
}
