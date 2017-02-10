package com.glory.service.study.a;

import org.junit.Test;

/**
 * Created by yangch on 2017/1/11 0011.
 */
public class RandomDemo {
    @Test
    public void demo01(){
        System.out.println(5%5);
        System.out.println("*************");
        java.util.Random random=new java.util.Random();
        for (int i=0;i<10;i++){
            System.out.println(random.nextInt(4+1));
        }
    }
}
