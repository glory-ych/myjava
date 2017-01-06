package com.glory.service.study.designpattern.factorymethod;

/**
 * Created by yangch on 2016/10/9.
 */
public class Main {
    public static void main(String[] args) {
        Factory wfactory = new WhiteHumanFactory();
        Human human = wfactory.create();
        human.say();

        human = new YellowHuman();
        YellowHuman yellowHuman = (YellowHuman) human;
        Human human1 = yellowHuman;
        System.out.println(yellowHuman.getClass().getName());
        System.out.println(human1.getClass().getName());
    }
}
