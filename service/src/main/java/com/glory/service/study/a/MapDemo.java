package com.glory.service.study.a;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangch on 2017/1/13 0013.
 */
public class MapDemo {
    @Test
    public void demo01() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "y");
        map.put(2, "y");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
