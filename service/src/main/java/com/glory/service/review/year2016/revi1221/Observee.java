package com.glory.service.review.year2016.revi1221;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangch on 2016/12/21 0021.
 */
public class Observee {
    public static void main(String[] args) {
        Observer observer = new Observer();
        Observee observee=new Observee();
        observee.add(observer);
        observee.operate();
        //Observer observer2 = new Observee.Observer();
    }

    private List<Observer> list = new ArrayList<>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void notifyAl() {
        for (Observer observer : list) {
            observer.operate();
        }
    }

    public void operate() {
        System.out.println("do...");
        this.notifyAl();
    }

    static class Observer {
        public void operate() {
            System.out.println("obervee do...");
        }
    }
}
