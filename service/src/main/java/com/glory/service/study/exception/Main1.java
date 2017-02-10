package com.glory.service.study.exception;

import org.junit.Test;

/**
 * Created by yangch on 2016/11/22 0022.
 */
public class Main1 {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.method1();
    }

    @Test
    public void method3() {
        System.out.println(System.currentTimeMillis() / 1000);
    }

    public void method2() {
        try {

            int i = 1 / 0;
        } catch (Exception e) {
            throw new RuntimeException("ext", e);
        }
    }

    public void method1() {
        try {
            this.method2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test1() {
        String str = "1,2,3";
        System.out.println(str.lastIndexOf(","));
    }

    @Test
    public void test2() {
        String str = "1,2,3";
        System.out.println(str.replaceAll(",", ""));
        System.out.println(str.length() - str.replaceAll(",", "").length());
    }
}
