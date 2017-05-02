package com.glory.service.study.map;

import com.glory.service.study.People;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yangch on 2017/2/14 0014.
 */
public class Main3 {
    @Test
    public void demo05() {
        Map map = new ConcurrentHashMap<>();
        Map map2 = new HashMap<>();
//        String str="11";
//        Long num=Long.valueOf(str);
//        System.out.println(num);
        //Long[] arr=new Long[10];
        //arr[0]=null;
        //System.out.println(arr[2]);
    }

    @Test
    public void demo04() {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            list.add(i);
//        }
//        List<Integer> uniq = new ArrayList<>();
        List<People> list = new ArrayList<>();
        List<People> uniq = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            //list.add(new People("ych", 100));
        }
        System.out.println(System.currentTimeMillis());
        for (int j = 0; j < list.size(); j++) {
            if (!uniq.contains(list.get(j))) {
                uniq.add(list.get(j));
            }
        }
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void demo03() {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            list.add(i);
//        }
        List<People> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            list.add(new People());
//        }
        System.out.println(System.currentTimeMillis());
//        Set<Integer> set = new HashSet<>(list);
        Set<People> set = new HashSet<>(list);
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void demo02() {
        String str = "name";
        HashMap<String, Integer> map = new HashMap<>();
        map.put(str, 123);
        map.put("age", 123);
        Map<String, Integer> map1 = (Map<String, Integer>) map.clone();
        //System.out.println(map1.merge());
        //System.out.println(map.get(str));
        //str = "kyh";
        //System.out.println(map.get("name"));
    }

    @Test
    public void demo01() {
        Map<People, Integer> map = new HashMap<>();
        //People p1 = new People("ych", 18);
        //People p2 = new People("ych", 20);
//        map.put(p1, 18);
//        System.out.println(map.get(p1));
//        p1.setName("kkk");
//        System.out.println(map.get(p1));
    }
}
