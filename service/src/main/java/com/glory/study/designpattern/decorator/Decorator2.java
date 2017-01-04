package com.glory.study.designpattern.decorator;

/**
 * Created by yangch on 2016/10/12.
 */
public class Decorator2 extends Decorator {
    public Decorator2(){}
    public Decorator2(Milk milk){
        super(milk);
    }
    public void operate() {
        super.operate();
        med();
    }
    public void med(){
        System.out.println("第二次装饰...");
    }
}
