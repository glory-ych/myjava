package com.glory.service.study.effectivejava.chapter7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yangch on 2016/11/4 0004.
 */
public class Demo02 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(20);
        List<Student> list=new ArrayList<>();
        list.add(student);
        student.setAge(30);
        System.out.println(list.get(0).getAge());
    }
    @Test
    public void test01(){
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);//改变了终止时间,破坏类的约束条件
    }
}
