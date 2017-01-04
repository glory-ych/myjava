package com.glory.study.designpattern.singleton;

/**
 * Created by yangch on 2016/10/8.
 */
public class SingleDoubleLock {
    private static SingleDoubleLock singleton;

    public static SingleDoubleLock getInstance() {
        if (singleton == null) {
            synchronized (SingleDoubleLock.class) {
                if (singleton == null) {
                    singleton = new SingleDoubleLock();
                }
            }
        }
        return singleton;
    }
}
