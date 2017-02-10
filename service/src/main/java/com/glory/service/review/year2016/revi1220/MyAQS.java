package com.glory.service.review.year2016.revi1220;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class MyAQS extends AbstractQueuedSynchronizer {
    ReentrantLock reentrantLock=new ReentrantLock();
}
