package com.glory.service.study.proxy.dynamic;

import com.glory.service.study.proxy.Student;
import com.glory.service.study.proxy.IStudent;
import com.glory.service.study.proxy.Student;

import java.lang.reflect.Proxy;

/**
 * Created by yangch on 2016/9/30.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        IStudent stu = (IStudent) Proxy.newProxyInstance(Student.class.getClassLoader(), student.getClass().getInterfaces(), new ProxyInvotationHandler(student));
        stu.print("name");
    }
}
