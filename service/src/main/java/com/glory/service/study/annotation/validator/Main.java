package com.glory.service.study.annotation.validator;

/**
 * Created by yangch on 2016/9/27.
 */
public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.setAge(20);
        try {
            PeopleValitorService.valit(people);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
