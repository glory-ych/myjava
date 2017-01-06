package com.glory.service.study.designpattern.singleton;

/**
 * Created by yangch on 2016/10/8.
 */
public class SingletonLazy {
    private static SingletonLazy singleton;

    private SingletonLazy() {
    }

    public synchronized static SingletonLazy getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
