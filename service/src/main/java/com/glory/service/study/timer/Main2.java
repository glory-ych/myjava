package com.glory.service.study.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yangch on 2016/12/5 0005.
 */
public class Main2 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("time..." + System.currentTimeMillis() / 1000);
            }
        };

        timer.schedule(task,1000,2000);
    }
}
