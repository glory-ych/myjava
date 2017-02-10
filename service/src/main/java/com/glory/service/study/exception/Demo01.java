package com.glory.service.study.exception;

import org.junit.Test;
import com.glory.service.study.utils.JacksonUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by yangch on 2016/11/18 0018.
 */
public class Demo01 {
    @Test
    public void test01() {
        String userIds = "[\"123,1111\",\"456,1111\",\"789,222\"]";
        List<String> userIdList = null;
        try {
            userIdList = JacksonUtil.json2List(userIds, String.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(userIdList.size());
    }

    @Test
    public void test02() {
        String str = "111,222";
        String[] arr = str.split(",");
        String str2 = "333,444";
        arr = str2.split(",");
        System.out.println(arr[0]);
    }

    @Test
    public void test03() {
        String str = "{\"id\":123}";
        try {
            CouponTemp couponTemp = JacksonUtil.json2Object(str, CouponTemp.class);
            System.out.println(couponTemp.getActType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test04() {
        String str = "{\n" +
                "\"shopId\":123,\n" +
                "\"ids\":[1,2,3],\n" +
                "\"actType\":1\n" +
                "}\n";
        try {
            Map map = JacksonUtil.json2Object(str, Map.class);
            map.put("xxx", JacksonUtil.json2List(map.get("ids").toString(), Long.class));
            for (Object key : map.keySet()) {
                System.out.println("key..." + key + ",value..." + map.get(key));
            }
            System.out.println("1".equals(String.valueOf(map.get("actType2"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
