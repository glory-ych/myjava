package com.glory.service.study.effectivejava.chapter7;

import java.util.Date;

/**
 * Created by yangch on 2016/11/4 0004.
 */
public class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
    }
//    public Period(Date start, Date end) {
//        if (start.compareTo(end) > 0)
//            throw new IllegalArgumentException(start + " after " + end);
//        this.start = start;
//        this.end = end;
//    }

    //    public Date start() {
//        return start;
//    }
//
//    public Date end() {
//        return end;
//    }
    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}
