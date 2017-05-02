package com.glory.service.review.revi0329.decorator;

/**
 * Created by yangch on 2017/3/29 0029.
 */
public class Decorator2 extends Decorator {
    public Decorator2(Component component){
        super(component);
    }
    @Override
    public void exec() {
        System.out.println("decorator2 exec...");
        super.exec();
    }
}
