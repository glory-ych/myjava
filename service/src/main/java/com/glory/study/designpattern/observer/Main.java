package com.glory.study.designpattern.observer;

/**
 * Created by yangch on 2016/10/11.
 */
public class Main extends Object {
    public static void main(String[] args) {
        IObserver o1 = new Observer("李斯");
        IObserver o2 = new Observer("赵高");
        IObserver o3 = new Observer("秦桧");
        IObservable oo = new Observable("秦始皇");
        oo.add(o1);
        oo.add(o2);
        oo.add(o3);
        oo.eat();
    }
}
