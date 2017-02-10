package com.glory.service.review.year2016.revi1220;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
