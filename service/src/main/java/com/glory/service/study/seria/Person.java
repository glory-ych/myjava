package com.glory.service.study.seria;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by yangch on 2017/3/21 0021.
 */
public class Person implements Serializable {

    private String name;

    String address;

    protected String sex;

    public String code;

    transient private Integer age = null;


    public Person() {
        System.out.println("none-arg constructor");
    }

    private Person(String name, Integer age) {
        System.out.println("arg constructor");
        this.name = name;
        this.age = age;
    }
    public static Person getInstance() {
        return InstanceHolder.instatnce;
    }

    private static class InstanceHolder {
        private static final Person instatnce = new Person("ych", 18);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + "]";
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(age);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        age = in.readInt();
    }
}
