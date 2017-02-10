package com.glory.service.study.exception;

/**
 * Created by yangch on 2016/11/25 0025.
 */
public class MyException extends RuntimeException {
    public MyException(String message, Throwable t) {
        super(message, t);
    }
}
