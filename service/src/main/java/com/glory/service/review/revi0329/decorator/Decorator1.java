package com.glory.service.review.revi0329.decorator;

/**
 * Created by yangch on 2017/3/29 0029.
 */
public class Decorator1 extends Decorator {
    public Decorator1(Component component){
        super(component);
    }
    @Override
    public void exec() {
        System.out.println("decorator1 exec...");
        super.exec();
    }
}
