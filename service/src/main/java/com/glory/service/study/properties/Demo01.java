package com.glory.service.study.properties;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * Created by yangch on 2016/11/3 0003.
 */
public class Demo01 {
    public static void main(String[] args) {
        String path1 = Demo01.class.getClassLoader().getResource("").getPath();
        //System.out.println(Demo01.class.getClassLoader().getResource("/"));
        String path2 = ClassLoader.getSystemResource("").getPath();
        String path3 = Demo01.class.getResource("Demo01.class").getPath();
        String path4 = Demo01.class.getResource("text.txt").getPath();
        String path5 = System.getProperty("/application.com.glory.study.properties");
        System.out.println(path5);
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
        System.out.println(path4);
    }

    @Test
    public void demo02() {
        String filepath = "C:/Users/Administrator/Desktop/application.com.glory.study.properties";
        File file = new File(filepath);

        Properties prop = new Properties();
        try {
            InputStream in = new FileInputStream(file);
            prop.load(in);
            Set<String> set = prop.stringPropertyNames();
            for (String name : set) {
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01() {
        //System.out.println(Thread.currentThread().getContextClassLoader().getResource("").toString());
        //System.out.println(this.getClass().getResource("/config/applicationContext.xml"));
        String path1 = Demo01.class.getClassLoader().getResource("").getPath();
        //String path2 = Demo01.class.getClassLoader().getResource("/").getPath();
        String path2 = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String path3 = Demo01.class.getResource("").getPath();
        String path4 = Demo01.class.getResource("/").getPath();

        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
        System.out.println(path4);
    }

    @Test
    public void test02() {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                if (true) {
                    try {
                        throw new RuntimeException("com/glory/study/exception");
                    } catch (Exception e) {
                        break;
                    } finally {

                        System.out.println("out true");
                    }
                }
                System.out.println("out i");
            }
            System.out.println("out foreach");
        }
        System.out.println("outer");
    }
}
