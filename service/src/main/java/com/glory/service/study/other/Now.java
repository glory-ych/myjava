package com.glory.service.study.other;

import com.glory.service.study.utils.MD5Util;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by yangch on 2016/12/12 0012.
 */
public class Now {
    @Test
    public void demo08() {
        System.out.println(System.currentTimeMillis() / 1000);
        //1486179264
        //1486366525
    }

    @Test
    public void demo07() {
        Integer n1 = 5;
        Integer n2 = 5;
        System.out.println(n1.compareTo(n2) <= 0);
    }

    @Test
    public void demo06() {
        int userid = 12360;
        int couponid = 769581;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 100; i++) {
            sb.append("\"");
            sb.append(userid + i + 1);
            sb.append(",");
            sb.append(couponid + i + 1);
            sb.append("\"");
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Test
    public void demo05() {
        int id = 12360;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 100; i++) {
            sb.append(id + i + 1);
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Test
    public void demo04() {
        StringBuilder couponSn = new StringBuilder();
        UUID uuid = UUID.randomUUID();
        String md5 = MD5Util.getMD5(uuid.toString()).toUpperCase();
        couponSn.append(md5.substring(0, 4)).append("-").append(md5.substring(8, 12)).append("-").append(md5.substring(12, 16)).append("-").append(md5.substring(16, 20)).append("-").append(md5.substring(20, 24));
        System.out.println(couponSn);
    }

    @Test
    public void demo03() {
        System.out.println(System.currentTimeMillis() / 1000);
    }

    @Test
    public void demo02() {
        List<Long> list = new ArrayList<>();
        list.add(1L);

    }

    @Test
    public void demo01() {
        System.out.println((new BigDecimal(2.0112)).setScale(2));
    }

    @Test
    public void demo00() {
        System.out.println(System.currentTimeMillis() / 1000);
    }

    @Test
    public void demo0() throws ParseException {
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
        //System.out.println(stime.getTime() / 1000);
        //System.out.println(etime.getTime() / 1000);
        //System.out.println(System.currentTimeMillis() / 1000);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(format.format(new Date()));
        System.out.println(format.format(new Date(1473120799000L)));
//        System.out.println(format.format(new Date(1482930099000L)));
        //System.out.println(new Date("2016-12-28 23:59:59").getTime() / 1000);
        //System.out.println(format.parse("2016-12-28 21:59:59").getTime() / 1000);
        //System.out.println(format.parse("2016-11-28 23:59:59").getTime() / 1000);
        //System.out.println(dayFormat.parse("2017-12-31").getTime() / 1000);
        //System.out.println("now..."+new Date().getTime()/1000);
        //System.out.println(new Date().getTime() / 1000);
    }

    @Test
    public void demo() {
        DateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat secondFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String day = dayFormat.format(new Date((1484906183 + 7 * 24 * 60 * 60) * 1000L));
        System.out.println(day);
        try {
            System.out.println(secondFormat.parse(day + " 23:59:59").getTime() / 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
