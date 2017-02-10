package com.glory.service.study.proxy.review1130;

import com.glory.service.study.proxy.Student;
import org.junit.Test;
import com.glory.service.study.proxy.Student;

import java.lang.reflect.Proxy;

/**
 * Created by yangch on 2016/11/30 0030.
 */
public class Main {
    @Test
    public void test02() {
        Student student = new Student();
        MyInvocationHandler handler = new MyInvocationHandler(student);
        Student proxy = (Student) Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), handler);
    }

    @Test
    public void test01() {
        Student studentProxy = MyMethodInterceptor.newInstance(Student.class);
    }
}
