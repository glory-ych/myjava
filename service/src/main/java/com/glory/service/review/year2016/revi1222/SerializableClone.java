package com.glory.service.review.year2016.revi1222;

import com.glory.service.study.effectivejava.chapter7.Student;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by yangch on 2016/12/22 0022.
 */
public class SerializableClone {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("ych");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(student);
        oos.close();

        ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bais);
        Student student1= (Student) ois.readObject();
        System.out.println(student1.getName());
    }
}
