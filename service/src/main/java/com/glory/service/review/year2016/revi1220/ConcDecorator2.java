package com.glory.service.review.year2016.revi1220;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class ConcDecorator2 extends Decorator {

    public ConcDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        System.out.println("ConcDecorator2...");
        super.operate();
    }
}
