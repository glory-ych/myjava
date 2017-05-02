package com.glory.service.study.designpattern.observer.jdk;

import java.util.Observable;

/**
 * Created by yangch on 2016/10/14.
 */
public class MyObservable extends Observable {
    public void action(){
        super.setChanged();
        System.out.println("action...");
        super.notifyObservers();
    }
}
