package com.glory.service.study.designpattern.command.dem1;

/**
 * Created by yangch on 2016/10/14.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void operate() {
        command.operate();
    }
}
