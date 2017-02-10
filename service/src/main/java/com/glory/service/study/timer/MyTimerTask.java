package com.glory.service.study.timer;

import java.util.TimerTask;

/**
 * Created by yangch on 2016/11/4 0004.
 */
public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + "...");
    }
}
