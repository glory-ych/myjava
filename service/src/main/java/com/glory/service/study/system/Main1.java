package com.glory.service.study.system;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by yangch on 2017/3/3 0003.
 */
public class Main1 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Map<String, String> map = System.getenv();
        Set<String> names = properties.stringPropertyNames();
        for (String name : names) {
            System.out.println("name=" + name + ",value=" + properties.getProperty(name));
        }
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
