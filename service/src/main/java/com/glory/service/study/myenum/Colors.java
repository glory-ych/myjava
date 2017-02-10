package com.glory.service.study.myenum;

/**
 * Created by yangch on 2016/11/16 0016.
 */
public enum Colors {
    Red(1, "红色"), Green(2, "绿色"), Blue(3, "蓝色");

    private int _value;
    private String _name;

    private Colors(int value, String name) {
        _value = value;
        _name = name;
    }

    public int value() {
        return _value;
    }

    public String getName() {
        return _name;
    }

    @Override
    public String toString() {
        return _name;
    }
}
