package com.glory.service.study.disconf;

import com.glory.service.study.People;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangch on 2017/3/7 0007.
 */
public class Demo01 {

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
//        People people = new People();
//        people.setName("ych");
//        System.out.println(people + "..." + people.getName());
//        demo01.change(people);
//        System.out.println(people + "..." + people.getName());

    }

    private void change(People people) {
//        people = new People();
        people.setName("yyy");
        System.out.println(people + "..." + people.getName());
    }

    @Test
    public void demo05() {

    }

    @Test
    public void demo04() {
        People people = null;
        people.setName("ych");
    }

    @Test
    public void demo03() {
        List<String> list = null;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(0));
        }
    }

    @Test
    public void demo02() {
        Map<String, People> map = new HashMap<>();
//        People people = new People();
//        people.setName("ych");
//        map.put("name", people);
//        System.out.println(map);
//        people.setName("nnn");
//        System.out.println(map);
    }

    @Test
    public void demo01() {
        String methodName = "getName";
        int prefixIndex = 0;

        // 必须以get或is开始的
        if (methodName.startsWith("get")) {
            prefixIndex = 3;

        } else if (methodName.startsWith("is")) {

            prefixIndex = 2;

        }

        String fieldName = methodName.substring(prefixIndex);
        if (fieldName.length() >= 1) {
            String firstCharStr = String.valueOf(fieldName.charAt(0))
                    .toLowerCase();
            if (fieldName.length() > 1) {
                fieldName = firstCharStr + fieldName.substring(1);
            } else {
                fieldName = firstCharStr.toLowerCase();
            }
        }
        System.out.println(fieldName);
    }
}
