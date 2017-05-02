package com.glory.service.review.revi0329.decorator;

/**
 * Created by yangch on 2017/3/29 0029.
 */
public class Main {
    public static void main(String[] args) {
        Component subject = new Subject();
        subject = new Decorator1(subject);
        subject = new Decorator2(subject);
        subject.exec();
    }
}
