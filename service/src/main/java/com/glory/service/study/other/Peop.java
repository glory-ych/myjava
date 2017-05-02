package com.glory.service.study.other;

import java.lang.reflect.Field;

/**
 * Created by yangch on 2017/3/23 0023.
 */
public class Peop extends Peo {
    private String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public static void main(String[] args) {
        Peop peop = new Peop();
        Field[] fields = peop.getClass().getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

//        Method[] methods = peop.getClass().getMethods();
//        for (Method method:methods){
//            System.out.println(method.getName());
//        }
    }
}
