package com.glory.service.study.a;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yangch on 2017/1/11 0011.
 */
public class DateDemo {
    @Test
    public void demo01() throws ParseException {
        Date today = new Date();
        DateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat secFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date stime = null;
        Date etime = null;
        try {
            stime = secFormat.parse(dayFormat.format(today) + " 00:00:00");//今天 00:00:00
            etime = secFormat.parse(dayFormat.format(today) + " 23:59:59");//今天 23:59:59
        } catch (ParseException e) {

        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.parse("2016-12-28 21:59:59").getTime() / 1000);
        System.out.println(format.parse("2016-11-28 23:59:59").getTime() / 1000);
        System.out.println(dayFormat.parse("2017-12-31").getTime() / 1000);
        System.out.println("now..." + new Date().getTime() / 1000);
        System.out.println(secFormat.format(new Date(1479980006000L)));
    }
}
