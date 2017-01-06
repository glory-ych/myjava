package com.glory.service.study.other;

/**
 * Created by yangch on 2016/10/12.
 */
public class FinilizeTest extends Object {
    public static void main(String[] args) {
        Object obj=new Object();

    }
    public void print() throws Throwable {
        super.finalize();
    }

    protected void test(){
        System.out.println("");
    }
}
