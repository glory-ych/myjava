package com.glory.service.study.myenum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by yangch on 2016/11/2 0002.
 */
public enum  Person {
    YELLOW("china"){
        @Override
        String lange() {
            return "i say china";
        }
    },WHITE("english"){
        @Override
        String lange() {
            return "i say english";
        }
    },BLACK("aliwla"){
        @Override
        String lange() {
            return "i say aliwla";
        }
    };

    @Override
    public String toString() {
        return language;
    }

    private String language;

    Person(String language){
        this.language=language;
    }
    public String say(){
        return lange();
    }
    abstract String lange();

    public static void main(String[] args) {
        //System.out.println(Person.BLACK.ordinal());
        System.out.println(Person.class.getName());

        apply(EnumSet.of(Person.BLACK,Person.WHITE));
        try {
            Method m = Person.class.getClass().getMethod("apply");
            m.isAnnotationPresent(Mark.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //new EnumMap<>();
    }

    @Mark
    public static void apply(Set<Person> personSet){

    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Mark{}
}
