package designpattern.singleton;

/**
 * Created by yangch on 2016/10/8.
 */
public class SingletonInnerClass {

    public static class Inner {
        final static SingletonInnerClass singleton = new SingletonInnerClass();
    }

    private SingletonInnerClass() {
    }

    public static SingletonInnerClass getInstance() {
        return Inner.singleton;
    }
}
