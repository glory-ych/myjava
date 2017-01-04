package com.glory.study.designpattern.facade;

/**
 * Created by yangch on 2016/10/20.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade(new SubSys1(), new SubSys2());
        facade.operate();
    }
}
