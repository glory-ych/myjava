package com.glory.service.study.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yangch on 2016/10/14.
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("get...");
    }
}
