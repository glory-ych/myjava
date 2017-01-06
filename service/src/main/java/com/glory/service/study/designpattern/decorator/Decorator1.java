package com.glory.service.study.designpattern.decorator;

/**
 * Created by yangch on 2016/10/12.
 */
public class Decorator1 extends Decorator {
    public Decorator1(Milk milk){
        super(milk);
    }
    public void operate() {
        super.operate();
        med();
    }

    public void med(){
        System.out.println("第一次装饰...");
    }
}
