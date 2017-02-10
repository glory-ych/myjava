package com.glory.service.study.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by yangch on 2017/1/9 0009.
 */
public class RandomUtil {
    public static <T extends Number> List<T> randomList(int count, Class<T> clazz) {
        List<T> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            switch (clazz.getSimpleName()) {
                case "Integer":
                    //list.add((T) random.nextInt());
                    break;
            }
        }
        return list;
    }
}
