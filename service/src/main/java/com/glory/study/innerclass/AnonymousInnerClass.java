package com.glory.study.innerclass;


/**
 * Created by yangch on 2016/10/9.
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {
        System.out.println(set(20, "杨常辉"));
    }

    private static String address = "北京";

    public static Student set(final int age, final String name) {
        final String email = "123@qq.com";
        return new Student() {
//            @Override
//            public String toString() {
//                return "name..." + name + ",age..." + age + ",address..." + address + ",email..." + email;
//            }

//            public Student print(){
//                return null;
//            }
        }.print();
    }
}
