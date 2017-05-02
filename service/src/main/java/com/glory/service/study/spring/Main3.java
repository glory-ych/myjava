package com.glory.service.study.spring;

/**
 * Created by yangch on 2017/3/2 0002.
 */
public class Main3 {
    public static void main(String[] args) throws Exception {
        System.out.println(SpringPropertyResourceReader.getProperty("vip.name"));
        System.out.println(SpringPropertyResourceReader.getProperty("vip.age"));
    }
}
