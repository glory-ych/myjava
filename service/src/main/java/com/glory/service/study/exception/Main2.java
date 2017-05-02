package com.glory.service.study.exception;

import java.io.File;

/**
 * Created by yangch on 2017/4/11 0011.
 */
public class Main2 {
    public static void main(String[] args) {
        test();
    }

    private static void test4() {
        test3();
    }

    private static void test3() throws UnsupportedOperationException {
        //受检异常：必须处理
        //非受检异常：可以不处理，Error、RuntimeException及其子类
        //运行时异常、检查异常

    }

    private static void test2() {
        File file = new File("");
        if (!file.exists()) {
//            file.createNewFile();
        }
    }

    private static void test() {
        try {
            int i = 1 / 0;
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch...");
            throw e;
        }
    }

}
