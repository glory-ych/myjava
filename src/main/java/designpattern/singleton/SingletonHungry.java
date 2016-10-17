package designpattern.singleton;

/**
 * Created by yangch on 2016/10/8.
 */
public class SingletonHungry {
    private static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singleton;
    }
}
