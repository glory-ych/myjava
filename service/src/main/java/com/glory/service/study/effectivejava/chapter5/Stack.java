package com.glory.service.study.effectivejava.chapter5;

import java.util.List;

/**
 * Created by yangch on 2016/11/1 0001.
 */
public class Stack<E> {
    public void add(E e) {
        System.out.println(e);
    }

    public void pushAll(Iterable<E> src){
        for (E e: src){
            System.out.println(e);
        }
    }

    public void print(List<? extends E> list){
        System.out.println(list.size());
    }
}
