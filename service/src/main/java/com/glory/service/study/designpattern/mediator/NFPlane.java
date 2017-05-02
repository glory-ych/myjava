package com.glory.service.study.designpattern.mediator;

/**
 * Created by yangch on 2017/4/11 0011.
 */
public class NFPlane extends Plane {
    private Dispatcher dispatcher;

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    @Override
    void down(String message) {
        dispatcher.dispatch(message,this);
    }

    @Override
    void avoid() {
        System.out.println("南方回避...");
    }
}
