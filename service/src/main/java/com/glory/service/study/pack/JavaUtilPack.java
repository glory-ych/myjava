package com.glory.service.study.pack;

import org.junit.Test;

import java.util.BitSet;
import java.util.HashMap;

/**
 * Created by yangch on 2017/3/20 0020.
 */
public class JavaUtilPack {
    @Test
    public void demo02() {
        HashMap hashMap;
//        Formatter formatter = new Formatter();
//        System.out.println(formatter.format("结果%2$(4d", 11, 22));
    }

    @Test
    public void demo01() {
        BitSet bitSet = new BitSet();
        System.out.println(bitSet.size());
        bitSet.set(63, 63);
        System.out.println(bitSet.get(63));
        System.out.println(bitSet.size());
        bitSet.set(64);
        System.out.println(bitSet.size());
        bitSet.set(65);
        System.out.println(bitSet.size());
    }
}
