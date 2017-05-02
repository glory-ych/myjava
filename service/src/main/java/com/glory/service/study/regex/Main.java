package com.glory.service.study.regex;

import org.junit.Test;

/**
 * Created by yangch on 2016/11/18 0018.
 */
public class Main {
    @Test
    public void demo03() {
        String str="coupon_temp_id_generator";
        String str2="coupon_user_id_generator";
        String str3="coupon_user_id_used_123";
//        String regex="^user_id_generator_[0-9]* | temp_id_generator_[0-9]* | shopping_id_generator_[0-9]* | user_id_used_[0-9]*$";
//        String regex="^[user_id | temp_id | shopping_id]_generator_[0-9]*$";
        String regex="(coupon_(user|temp|shopping)_id_generator|coupon_user_id_used_[1-9][0-9]*)";
        System.out.println(str.matches(regex));
    }
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
