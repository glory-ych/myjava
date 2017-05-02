package com.glory.service.study.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by yangch on 2017/3/13 0013.
 */
public class CountDownLatchDemo implements Runnable {
    private Videoconference conference;
    private String name;

    public CountDownLatchDemo(Videoconference conference, String name) {
        this.conference = conference;
        this.name = name;
    }

    public static void main(String[] args) {
        Videoconference conference = new Videoconference(9);
        Thread threadConference = new Thread(conference);
        threadConference.start();
        //Thread threadConference2 = new Thread(conference);
        //threadConference2.start();
        for (int i = 0; i < 10; i++) {
            CountDownLatchDemo p = new CountDownLatchDemo(conference, "Participant" + i);
            Thread t = new Thread(p);
            t.start();
        }
    }

    @Override
    public void run() {

        long duration = (long) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        conference.arrive(name);
    }


    static class Videoconference implements Runnable {
        private final CountDownLatch controller;

        public Videoconference(int number) {
            controller = new CountDownLatch(number);
        }

        public void arrive(String name) {
            System.out.println(name + " has arrived.");
            controller.countDown();
            System.out.println("VideoConference:Waiting for " + controller.getCount());
        }

        @Override
        public void run() {
            System.out.println("VideoConference:Initialization:" + controller.getCount() + "...ThreadName=" + Thread.currentThread().getName());

            try {
                controller.await();
                System.out.printf("VideoConference: All the participants have come\n");
                System.out.printf("VideoConference: Let's start...\n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
