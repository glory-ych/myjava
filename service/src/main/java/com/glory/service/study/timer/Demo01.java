package com.glory.service.study.timer;

import java.util.Timer;

/**
 * Created by yangch on 2016/11/4 0004.
 */
public class Demo01 {
    public static void main(String[] args) {
        Timer timer = new Timer("ych");
        MyTimerTask task = new MyTimerTask();
        timer.schedule(task, 1000, 500);
    }
}
