package com.glory.service.study;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by yangch on 2016/12/30 0030.
 */
public class People implements Serializable, Cloneable {
    private static final long serialVersionUID = -3276812112838760697L;

    public People() {
        System.out.println("*******");
    }


    private String name;
    transient private Integer age;

    private People(String name, Integer age) {
        this.name = name;
        this.age = age;
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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static People getInstance() {
        return InstanceHolder.instatnce;
    }

    private static class InstanceHolder {
        private static final People instatnce = new People("ych", 18);
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve...");
        return InstanceHolder.instatnce;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }
}
