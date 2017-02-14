package com.glory.service.study.date;

import org.junit.Test;

import java.util.Calendar;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class CalendarDemo {
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
