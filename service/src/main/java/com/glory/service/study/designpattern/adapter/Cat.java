package com.glory.service.study.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangch on 2016/10/17.
 */
public class Cat {
    protected Map<String, String> getCatName() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "加菲猫");
        return map;
    }
}
