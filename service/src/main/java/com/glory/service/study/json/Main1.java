package com.glory.service.study.json;

import com.glory.service.study.utils.JacksonUtil;
import org.junit.Test;
import com.glory.service.study.utils.JacksonUtil;

import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yangch on 2016/11/24 0024.
 */
public class Main1 {
    @Test
    public void test02() {
        Date today = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date start = format2.parse(format.format(today) + " 00:00:00");
            Date end = format2.parse(format.format(today) + " 23:59:59");
            System.out.println(end.getTime() / 1000 - start.getTime() / 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01() throws IOException {
        String str = "[1,2]";
        List<String> list = JacksonUtil.json2List(str, String.class);
        System.out.println(list.size());
    }

    public static void main(String[] args) throws IOException {
        String str = "107256,107257,107258";
        //List<Long> list= JacksonUtil.json2List(str,Long.class);
        List list2 = Arrays.asList(str);
        System.out.println(list2.size());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        SoftReference<Integer> softReference;
        WeakReference<Integer> weakReference;
        PhantomReference<Integer> phantomReference;

        WeakHashMap weakHashMap;
    }
}
