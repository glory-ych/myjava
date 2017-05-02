package com.glory.service.study.other;

import com.glory.service.study.utils.JacksonUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;


/**
 * Created by yangch on 2017/2/22 0022.
 */
public class Main7 {
    @Test
    public void demo12() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "ych");
        System.out.println("**************start***************");
        StringBuilder sb1=new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            sb1.append(map.get("name"));
        }
        long end = System.currentTimeMillis();
        System.out.println("**************end***************" + (end - start));
        StringBuilder sb2=new StringBuilder();
        start = System.currentTimeMillis();
        String name = map.get("name");
        for (int i = 0; i < 100; i++) {
            sb2.append(name);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void demo11() {
        Sour sour = new Sour() {
            @Override
            public boolean isTrue() {
                return false;
            }
        };
        System.out.println(sour.getClass().getName());
    }

    @Test
    public void demo10() {
        try {
            Student student = new Student();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(student);

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("master", "mt1");
        map.put("slave", "sl1");
        Map<String, String> map1 = new HashMap<>();
        map1.put("master", "mt2");
        map1.put("slave", "sl2");
        list.add(map);
        list.add(map1);
        for (Map<String, String> map2 : list) {
            Set<Map.Entry<String, String>> entrySet = map2.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                System.out.println("key=" + entry.getKey() + ",val=" + entry.getValue());
            }
        }
//        System.out.println(list.size());
    }

    @Test
    public void demo09() {
        while (true) {
            System.out.println("hello");
            return;
        }
    }

    @Test
    public void demo08() {
        HttpClient httpClient = HttpClients.createDefault();
        //HttpClient httpClient1=new DefaultHttpClient();
//        HttpPost httpPost = new HttpPost("http://java.sun.com");
        HttpGet httpGet = new HttpGet("http://java.sun.com");
//        OperatedClientConnection
//        BasicHttpParams

        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void demo07() {
//        System.out.println(.7*10);
        boolean isShow = false;
        System.out.println(isShow ? false : true);
    }

    @Test
    public void demo06() {
        CRC32 crc32 = new CRC32();
        crc32.update("coupon_temp_4".getBytes());
        System.out.println(crc32.getValue());
    }

    @Test
    public void demo05() {
        DateFormat dateFormat = new SimpleDateFormat();

        Formatter formatter = new Formatter();
        System.out.println(formatter.format("%04d", 123).toString());
        System.out.println(String.format("%-5d", 1));
        System.out.print(String.format("%-5s", "a"));
    }

    @Test
    public void demo04() {

        List<YCH> list = new ArrayList<>();
        list.add(new YCH(20));
        list.add(new YCH(18));
        System.out.println(list);
        Collections.sort(list, new YCHCompartor());
        System.out.println(list);
//        Collections.sort(list, new Comparator<YCH>() {
//            @Override
//            public int compare(YCH o1, YCH o2) {
//                if (o1.age > o2.age) return 1;
//                else if (o1.age == o2.age) return 0;
//                else return -1;
//            }
//        });
//        System.out.println(list);
    }

    class YCHCompartor implements Comparator<YCH> {

        @Override
        public int compare(YCH o1, YCH o2) {
            return o1.age.compareTo(o2.getAge());
        }
    }

    class YCH {
        private Integer age;

        public YCH(int age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return age.toString();
        }

    }

    @Test
    public void demo03() {

        int x = Character.digit('c', 18);
        System.out.println("x=" + x);

        Long l1 = Long.valueOf("22", 8);
        long l2 = Long.parseLong("22", 8);
        System.out.println(l2);
        System.out.println(l1);
    }

    @Test
    public void demo02() {
        Map<String, List<String[]>> map = new HashMap<>();
        String[] arr = new String[2];
        arr[0] = "name";
        arr[1] = "ych";
        List<String[]> list = new ArrayList<>();
        list.add(arr);
        map.put("test", list);
        System.out.println(map.toString());
        String[] arr2 = new String[2];
        arr[0] = "age";
        arr[1] = "123";
        map.get("test").add(arr2);
        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run...");
            }
        });
        thread.start();
        thread.start();
    }

    @Test
    public void demo01() {
        Student student = new Student();
        student.setAge(20);
        student.setName("ych");
        String str = JacksonUtil.object2Json(student);

        try {
            StudentDto dto = JacksonUtil.json2Object(str, StudentDto.class);
            System.out.println(dto);
            Student student1 = dto.create();
            System.out.println(student1);

            StudentDto dto1 = new StudentDto("kkk");
            System.out.println(dto1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    interface Sour {
        boolean isTrue();
    }
}

