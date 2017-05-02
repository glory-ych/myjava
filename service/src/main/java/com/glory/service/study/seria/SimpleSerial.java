package com.glory.service.study.seria;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by yangch on 2017/3/21 0021.
 */
public class SimpleSerial {
    public static void main(String[] args) throws Exception {
//        File file = new File("person.out");
//
//        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
//        Person person = Person.getInstance();
//        oout.writeObject(person);
//        oout.close();
//
//        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
//        Object newPerson = oin.readObject(); // 没有强制转换到Person类型
//        oin.close();
//        System.out.println(newPerson);

//        People people = People.getInstance();
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(baos);
//        oos.writeObject(people);
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
//        People people1 = (People) ois.readObject();
//        System.out.println(people1);

        Person people = Person.getInstance();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(people);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Person people1 = (Person) ois.readObject();
        System.out.println(people1);
    }
}
