package com.glory.study.designpattern.command.dem1;

/**
 * Created by yangch on 2016/10/14.
 */
public class Command {
    private Receiver receiver;
    public Command(Receiver receiver){
        this.receiver=receiver;
    }
    public void operate(){
        receiver.operate();
    }
}
