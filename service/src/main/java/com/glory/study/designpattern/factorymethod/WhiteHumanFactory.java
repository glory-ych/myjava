package com.glory.study.designpattern.factorymethod;

/**
 * Created by yangch on 2016/10/9.
 */
public class WhiteHumanFactory implements Factory {
    @Override
    public Human create() {
        return new WhiteHuman();
    }
}
