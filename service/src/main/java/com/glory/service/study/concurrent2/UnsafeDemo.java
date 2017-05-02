package com.glory.service.study.concurrent2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by yangch on 2017/3/17 0017.
 */
public class UnsafeDemo {
    public static void main(String[] args) throws Exception {
        //Unsafe unsafe = Unsafe.getUnsafe();
        Field f = Unsafe.class.getDeclaredField("theUnsafe"); //Internal reference
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        byte[] arr = new byte[10];
        System.out.println(Arrays.toString(arr));
        long offSet = unsafe.arrayBaseOffset(byte[].class);
        System.out.println("offSet..." + offSet);
        unsafe.putByte(arr,offSet, (byte) 1);
        unsafe.putByte(arr,offSet+5, (byte) 20);
        System.out.println(Arrays.toString(arr));
    }
}
