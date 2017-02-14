package com.glory.service.study.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class Main6 {
    @Test
    public void demo01() {
        List<People> list = new ArrayList<>();
        list.add(new People());
        list.add(null);
        list.add(new People());
        Map<String, String> map = new HashMap<>();
        System.out.println(list.get(0).getName() == null);
        if(!map.containsKey(list.get(0).getName())){
            String str=map.get(list.get(0).getName());
            System.out.println(str);
        }
//        System.out.println(map.containsKey(list.get(0).getName()));
//        System.out.println(list.size());
//        for (People people : list) {
//            System.out.println(people);
//        }
    }
}
