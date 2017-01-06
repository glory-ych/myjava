package com.glory.service.study.designpattern.simplefactory;


/**
 * Created by yangch on 2016/10/9.
 */
public class Factory {
    public static Human create(String type) {
        Human human;
        switch (type) {
            case "white":
                human = new WhiteHuman();
                break;
            case "yellow":
                human = new YellowHuman();
                break;
            default:
                human = null;
        }
        return human;
    }
}
