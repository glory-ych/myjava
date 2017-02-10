package com.glory.service.study.classloader;

import org.junit.Test;

/**
 * Created by yangch on 2016/11/1 0001.
 */
public class Test1 {
    public static void main(String[] args) {
        //loader1的父加载器为系统类加载器
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("D:/");
        //loader2的父加载器为loader1
        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setPath("D:/lib");
        MyClassLoader loader3 = new MyClassLoader(null, "loader3");
        loader3.setPath("D:/");
        Class clazz = null;

        try {
            clazz = loader3.loadClass("Sample");
            Object object = clazz.newInstance();
            System.out.println(object.getClass().getClassLoader().getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01(){
        Object str="123";
        System.out.println(str instanceof String);
        System.out.println((String)str);
    }
}
