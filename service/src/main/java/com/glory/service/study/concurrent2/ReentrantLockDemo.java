package com.glory.service.study.concurrent2;

import org.junit.Test;
import org.springframework.core.env.StandardEnvironment;
import sun.misc.Unsafe;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangch on 2017/3/17 0017.
 */
public class ReentrantLockDemo {
    @Test
    public void demo03() {
        StandardEnvironment standardEnvironment = new StandardEnvironment();
        String[] arr = standardEnvironment.getDefaultProfiles();
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void demo02() {
//        for (;;){
//            System.out.println("1");
//            return;
//        }
        AtomicInteger atomicInteger = new AtomicInteger(100);
        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger);
        Unsafe unsafe = Unsafe.getUnsafe();

    }

    @Test
    public void demo01() {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        try {
            lock.lock();
            System.out.println(lock.getHoldCount());
            lock.lock();
            System.out.println(lock.getHoldCount());
            System.out.println(lock.tryLock());
        } catch (Exception e) {

        } finally {
            lock.unlock();
            lock.unlock();
        }
    }
}
