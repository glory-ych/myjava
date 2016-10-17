package proxy.dynamic;

import proxy.IStudent;
import proxy.Student;

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
