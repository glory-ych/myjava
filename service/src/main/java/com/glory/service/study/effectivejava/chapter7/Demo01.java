package com.glory.service.study.effectivejava.chapter7;

import org.junit.Test;

/**
 * Created by yangch on 2016/11/4 0004.
 */
public class Demo01 {
    public static void main(String[] args) {
        //断言1结果为true，则继续往下执行
        assert true;
        System.out.println("断言1没有问题，Go！");

        System.out.println("\n-----------------\n");

        //断言2结果为false,程序终止
        assert false : "断言失败，此表达式的信息将会在抛出异常的时候输出！";
        System.out.println("断言2没有问题，Go！");
    }

    public static void print(Integer i) {
        //String info = (assert i > 100 : "参数有误");
//        assert i > 100 : return;
        //AssertionError
        //RuntimeException
        System.out.println(i);
    }

    @Test
    public void test01() {

    }
}
