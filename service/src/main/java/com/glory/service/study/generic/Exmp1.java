package com.glory.service.study.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by yangch on 2016/12/14 0014.
 */
public class Exmp1 extends Base<String, Long> {
    public static void main(String[] args) {
        Exmp1 exmp1 = new Exmp1();
        Type genType = exmp1.getClass().getGenericSuperclass();
        System.out.println(genType instanceof ParameterizedType);
        System.out.println(exmp1.getClass().getGenericSuperclass());
    }
}
