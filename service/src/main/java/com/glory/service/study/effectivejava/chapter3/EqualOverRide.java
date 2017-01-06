package com.glory.service.study.effectivejava.chapter3;

/**
 * Created by yangch on 2016/10/14.
 */
public class EqualOverRide {
    public static void main(String[] args) {
        EqualOverRide ride1 = new EqualOverRide();

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof EqualOverRide) {
            EqualOverRide ride = (EqualOverRide) obj;
            return ride == this;
        }
        return false;
    }
}
