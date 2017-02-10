package com.glory.service.study.myenum;

import com.glory.service.study.utils.JacksonUtil;
import com.glory.service.study.utils.MD5Util;
import org.junit.Test;
import com.glory.service.study.utils.JacksonUtil;
import com.glory.service.study.utils.MD5Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by yangch on 2016/11/16 0016.
 */
public class Main {
    @Test
    public void demo04(){
        System.out.println(Colors.Blue);
        System.out.println(Colors.Blue);
    }
    @Test
    public void demo03() {
        UUID uuid = UUID.randomUUID();
        String md5 = MD5Util.getMD5(uuid.toString()).toUpperCase();
        System.out.println(md5);
        StringBuilder result = new StringBuilder();
        result.append(md5.substring(0, 4)).append("-");
        System.out.println(result);
        result.append(md5.substring(8, 12)).append("-");
        System.out.println(result);
        result.append(md5.substring(12, 16)).append("-");
        System.out.println(result);
        result.append(md5.substring(16, 20)).append("-");
        System.out.println(result);
        result.append(md5.substring(20, 24));
        System.out.println(result);
        //System.out.println(MD5Util.getMD5(uuid.toString().replace("-","")));
        //System.out.println(uuid.toString().substring(4, 28).toUpperCase());
    }
    @Test
    public void makeCouponSn() {
        StringBuilder couponSn = new StringBuilder();
        UUID uuid = UUID.randomUUID();
        String md5 = MD5Util.getMD5(uuid.toString()).toUpperCase();
        couponSn.append(md5.substring(0, 4)).append("-").append(md5.substring(8, 12)).append("-").append(md5.substring(12, 16)).append("-").append(md5.substring(16, 20)).append("-").append(md5.substring(20, 24));
        System.out.println(String.valueOf(couponSn));
    }
    @Test
    public void demo02() {
        Date date = new Date();
        System.out.println(date.getTime());
    }

    @Test
    public void demo01() throws IOException {
        String data = "[]";
        List<String> dataList = JacksonUtil.json2List(data, String.class);
        System.out.println(dataList.size());
        List<Map> list = new ArrayList<>();
        if (dataList.size() > 0) {
            for (String str : dataList) {
                Map map = new HashMap<>();
                String[] arr = str.split(",");
                if (arr.length == 2) {
                    map.put(arr[0], arr[1]);
                }
                list.add(map);
            }
        }
        System.out.println(list.size());
        for (Map map : list) {
            for (Object couId : map.keySet()) {
                System.out.println(couId + ":" + map.get(couId));
            }
        }
//        System.out.println(list==null);
    }
}
