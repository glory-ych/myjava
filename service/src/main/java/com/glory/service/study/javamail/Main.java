package com.glory.service.study.javamail;

import org.junit.Test;

/**
 * Created by yangch on 2016/11/24 0024.
 */
public class Main {
    @Test
    public void test01(){
        String preConsignno="O40d1b33d01a0194e";
        String packSn = "";
        if (preConsignno.toUpperCase().startsWith("O")) {
            packSn = preConsignno.substring(1, preConsignno.length() - 1);
        } else {
            packSn = preConsignno;
        }
        System.out.println(packSn);
    }

    public static void main(String[] args) {
        try {
            MailUtil.send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
