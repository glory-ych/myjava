package com.glory.service.study.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by yangch on 2017/3/21 0021.
 */
public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    }

    private int test1() {
        int i = 0;
        while (true){
            i++;
        }
    }
}
