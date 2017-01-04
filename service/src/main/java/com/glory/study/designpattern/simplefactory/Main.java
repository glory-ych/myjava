package com.glory.study.designpattern.simplefactory;

/**
 * Created by yangch on 2016/10/9.
 */
public class Main {
    public static void main(String[] args) {
        Human human = Factory.create("yellow");
        human.say();
    }
}
