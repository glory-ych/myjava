package com.glory.service.study.map;

/**
 * Created by yangch on 2016/11/29 0029.
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(hash(0001111));
        System.out.println(Integer.parseInt("0001111", 2));
    }

    private static int hash(int h) {
        h += (h << 15) ^ 0xffffcd7d;
        h ^= (h >>> 10);

        h += (h << 3);
        h ^= (h >>> 6);

        h += (h << 2) + (h << 14);
        return h ^ (h >>> 16);

    }

}
