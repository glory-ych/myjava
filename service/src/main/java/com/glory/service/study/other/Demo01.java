package com.glory.service.study.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangch on 2016/12/21 0021.
 */
public class Demo01 {

    @Test
    public void test03(){
        Map<String, String> smsParam = new HashMap<>();
        smsParam.put("smsType", "300004");
        smsParam.put("uid", "111");
        System.out.println(smsParam);
        System.out.println(smsParam.toString());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
//        Demo01 demo01=new Demo01();
//        demo01.say("ych");
    }

    public void say(String name, Object... objects) {
        System.out.println(name);
        System.out.printf(String.valueOf(objects.length));
    }

    @Test
    public void test02() {
        Map<String, Object> map = new HashMap<>();
        map.put("couponSn", "8B6E-944E-2388-6FED-89B9");
        map.put("shopId", 1L);
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(0).getClass());
        }
    }

    @Test
    public void test01() {
        //CopyOnWriteArrayList
        //ReentrantLock
        List<Map<String, Object>> temp = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("couponSn", "8B6E-944E-2388-6FED-89B9");
        map.put("shopId", 1L);
        temp.add(map);
        map.put("couponSn", "5AE1-3695-4910-412C-8863");
        map.put("shopId", 1L);
        temp.add(map);
        System.out.println(temp.get(1).get("couponSn"));
    }
}
