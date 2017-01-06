package com.glory.service.study.designpattern.command;

/**
 * Created by yangch on 2016/10/14.
 */
public abstract class Command {
    protected Receiver receiver;
    abstract void operate();
}
