package com.glory.service.study.other;

import org.hibernate.validator.constraints.NotEmpty;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.validation.Valid;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by yangch on 2016/9/27.
 */
public class Main {
    @Test
    public void demo08() {
        Map<String, String> map = new HashMap<>();
        String val = new String("val");
        map.put("key", val);
        System.out.println(map.get("key"));
        val.replace("v", "H");
        System.out.println(map.get("key"));
    }

    @Test
    public void demo07() {
        Man man = new Man();
        man.setName("ych");
        man.setAge(18);
        System.out.println(man);
        People people = (People) man;
        System.out.println(people);
    }

    class People {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.getName();
        }
    }

    class Man extends People {
        private int age;

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return this.getName() + "---" + this.getAge();
        }
    }

    @Test
    public void demo06() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        ReentrantLock reentrantLock;
        ReadWriteLock readWriteLock;
        char[] arr = {'a', 'b', 'c'};
        System.out.println(Array.getInt(arr, 1));
    }

    @Test
    public void demo05() {
        Class clazz = Main.class.getComponentType();
        System.out.println(clazz.getName());
    }

    @Test
    public void demo04() {
        Random random = new Random();
        for (int i = 0; i < 20; i++)
            System.out.println(random.nextInt(3));
    }

    @Test
    public void demo03() {
        Object obj = null;
        System.out.println((String) obj);
    }

    @Test
    public void demo02() {
        Set<Object> set1 = new HashSet<Object>();
        set1.add("ych");
        set1.add(new Student());
        set1.add("fyy");
        set1.add(null);
        Set<String> set2 = new HashSet<String>();
        for (Object obj : set1) {
            if (obj instanceof String) {
                set2.add((String) obj);
            }
        }
        for (String str : set2) {
            System.out.println(str);
        }
//        Student student = new Student();
//        student.setAge(10);
//        System.out.println(student.getAge());
    }

    @Money(message = "money>0")
    public double getMoney(double money) {
        return money;
    }

    @Valid
    @NotEmpty(message = "bo.product_marketing.error_form_code_is_empty")
    public String getCode(String code) {
        if (code == null) {
            return "";
        }
        return code;
    }

//    @Test
//    public void demo01() {
//        String[] ids = new String[]{"yyy", "ccc"};
//        String[] ids2 = new String[]{};
//        //Inner inner = new Inner();
//        //inner.setIds(null);
//        //this.print("");
//        this.print2();
//    }

    @Valid
    @NotEmpty(message = "return null")
    private String print2() {
        return null;
    }

    private void print(@NotEmpty(message = "1fasdf") String id) {
        System.out.println(id);
    }

    class Inner {
        @NotEmpty(message = "为空了")
        private String[] ids;

        public String[] getIds() {
            return ids;
        }

        public void setIds(String[] ids) {
            this.ids = ids;
        }
    }

    @Test
    public void demo01() {
        //ApplicationContextFacade;
        Integer i = 0;
        System.out.println(i instanceof Number);
        System.out.println(Integer.class.isAssignableFrom(Number.class));
        System.out.println(Number.class.isAssignableFrom(Integer.class));

        ApplicationContext applicationContext;
        WebApplicationContext webApplicationContext;
        XmlWebApplicationContext xmlWebApplicationContext;
        ConfigurableWebApplicationContext configurableWebApplicationContext;

        Class[] classes = new Class[0];
        try {
            Constructor constructor = Student.class.getDeclaredConstructor(classes);
            constructor.newInstance(new Object[0]);
//            ApplicationContextFacade
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static ThreadLocal<Integer> count = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                public void run() {
                    int num = random.nextInt(100);
                    System.out.println(Thread.currentThread().getName() + "...time..." + System.currentTimeMillis() + "...set count=" + num);
                    count.set(count.get() + num);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "...time..." + System.currentTimeMillis() + "...get count=" + count.get());
                }
            }).start();
        }

    }

}
