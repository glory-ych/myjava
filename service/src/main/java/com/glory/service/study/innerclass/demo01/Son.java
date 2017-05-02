package com.glory.service.study.innerclass.demo01;

/**
 * Created by yangch on 2017/4/14 0014.
 */
public class Son extends Father {
    public Mother_ getMother_() {
        return new Mother_();
    }

    Mother_ mother_;

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("son..."+son);
        son.getMother_().houseWork();
//        System.out.println(mother_);
    }

    private void work() {
        makeMoney();
        mother_.houseWork();
    }

    @Override
    public void makeMoney() {
        System.out.println("挣钱...");
    }

    class Mother_ extends Mother {

        @Override
        public void houseWork() {
            System.out.println("家务..."+Son.this);
        }
    }
}
