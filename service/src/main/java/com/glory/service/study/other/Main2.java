package com.glory.service.study.other;

import org.junit.Test;
import com.glory.service.study.utils.JacksonUtil;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yangch on 2016/10/14.
 */
public class Main2 {
    @Test
    public void demo17() {
        String str = (String) null;
        System.out.println(str=="null");
    }

    @Test
    public void demo16() {
        String obj = "a";
        System.out.println(Long.valueOf(obj));
    }

    @Test
    public void demo15() {
        Object obj = "";
        System.out.println(obj.getClass());
    }

    @Test
    public void demo14() {
        String str1 = "";
        String str2 = "   ";
        System.out.println(str1.isEmpty());
        System.out.println(str2.trim().isEmpty());
    }

    @Test
    public void demo13() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "ych");
        map.put("name", "xyz");
        System.out.println(map.size() + "," + map.get("name"));
    }

    @Test
    public void demo12() {
        List<String> list = null;
        for (String str : list) {
            System.out.println(str);
        }
    }

    @Test
    public void demo11() {
        String str = " a ";
        //System.out.println(str.trim().isEmpty());
        System.out.println(str.indexOf("_"));
        System.out.println(str.substring(0, str.indexOf("_")));
    }

    @Test
    public void demo10() {
        List<String> list = new ArrayList<>();
        list.add("1_2");
        list.add("2a_3");
        System.out.println(list.toString());
    }

    @Test
    public void demo09() {
        List<String> list = new ArrayList<>();
        list.add("1_2");
        list.add("2_3");
        List<String> couponSnList = new ArrayList<>();
        couponSnList.add("abc");
        couponSnList.add("def");
        Map<String, Long> map = new HashMap<>();
        Iterator iterator = list.iterator();
        String result = "";
        for (String couponSn : couponSnList) {
            result = iterator.next().toString();
            map.put(couponSn, Long.valueOf(result.substring(result.indexOf("_") + 1)));
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "..." + entry.getValue());
        }
    }

    @Test
    public void demo08() {
        String result = "1112_2";
        String str = result.substring(0, result.indexOf("_"));
        System.out.println(Long.valueOf(str));
    }

    @Test
    public void demo07() {
        Map map = new HashMap<>();
        map.put("name", "ych");
        System.out.println(map.get("name"));
        Map map1 = new HashMap<>();
        map1.put("name", "ceshi");
        map = map1;
        System.out.println(map.get("name"));
    }

    @Test
    public void demo06() {
        String str = "123_456";
        System.out.println(str.substring(0, str.lastIndexOf("_")));
    }

    @Test
    public void demo05() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("age", 10);
        map.put("name", "ych");
        String result = JacksonUtil.object2Json(map);
        System.out.println(result);
        Student student = JacksonUtil.json2Object(result, Student.class);
        System.out.println(student.getName());
    }

    @Test
    public void demo04() throws IllegalAccessException {
        Student student = new Student();
        student.setName("ych");
        Field[] fields = Student.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            field.setAccessible(true);
            System.out.println(field.get(student));
        }
    }

    @Test
    public void demo03() {
        Student student = new Student();
        student.setName("allProduct");
        System.out.println(student.getName() == "allProduct");
    }

    @Test
    public void demo01() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, -20);//日期减20天
        Date before20Day = calendar.getTime();
        System.out.println(format.format(before20Day));
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, -10);//日期减10天
        Date before10Day = calendar.getTime();
        System.out.println(format.format(before10Day));
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, 10);//日期加10天
        Date after10Day = calendar.getTime();
        System.out.println(format.format(after10Day));
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, 20);//日期加20天
        Date after20Day = calendar.getTime();
        System.out.println(format.format(after20Day));
    }

    public static void main(String[] args) {
        People people = new BlackPeople();
        people.get();
    }

    @Test
    public void demo02() {
        System.out.println(String.valueOf(System.currentTimeMillis()).length());

        AtomicInteger atomicInteger;
    }

    /**
     * redis-string
     * get/set
     * mset k v k v ...,mget k k k ...
     * incr/decr key
     * incrby/decrby key delta
     * incrbyfloat key delta
     * setrange key start end value,getrange key start end
     * append key value
     * strlen key
     *
     */

}
