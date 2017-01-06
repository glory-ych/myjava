package com.glory.service.study.designpattern.facade;

/**
 * Created by yangch on 2016/10/20.
 */
public class Facade {
    private SubSys1 subSys1;
    private SubSys2 subSys2;

    public Facade(SubSys1 subSys1, SubSys2 subSys2) {
        this.subSys1 = subSys1;
        this.subSys2 = subSys2;
    }

    public void operate(){
        subSys1.operate();
        subSys2.operate();
    }
}
