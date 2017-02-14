package com.glory.service.study.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class CollectionsDemo {
    @Test
    public void demo01() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);

        System.out.println(list);
//        System.out.println(Collections.max(list));
//        Collections.rotate(list,1);
//        Collections.shuffle(list);
//        Collections.addAll(list, 55, 66, 77);
//        System.out.println(Collections.frequency(list, 8));
        System.out.println(Collections.list(Color.BLACK));
    }

    enum Color implements Enumeration<Object> {
        BULUE, BLACK, WHITE;

        @Override
        public boolean hasMoreElements() {
            return false;
        }

        @Override
        public Object nextElement() {
            return null;
        }
    }
}
