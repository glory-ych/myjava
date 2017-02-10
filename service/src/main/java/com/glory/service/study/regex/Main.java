package com.glory.service.study.regex;

import org.junit.Test;

/**
 * Created by yangch on 2016/11/18 0018.
 */
public class Main {
    @Test
    public void demo01() {
        String str = "all";
        String regex = "^all|product$";
        System.out.println(RegexUtil.match(str,regex));
    }
    @Test
    public void demo02(){
        System.out.println(System.currentTimeMillis()/1000);
    }
}
