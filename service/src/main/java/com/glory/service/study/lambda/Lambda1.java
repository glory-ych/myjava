package com.glory.service.study.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangch on 2016/10/9.
 */
public class Lambda1 {
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> players = new ArrayList<>();
        players.add(1);
        players.add(2);
        players.add(3);
        int sum = 0;
        //players.forEach((player) -> System.out.println(sum += player));

        Runnable runnable = () -> System.out.println("runnable");
    }
}
