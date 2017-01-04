package com.glory.study.designpattern.observer.jdk;

import java.util.Observer;

/**
 * Created by yangch on 2016/10/14.
 */
public class Main {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        Observer myObserver = new MyObserver();
        observable.addObserver(myObserver);
        observable.action();
    }
}
