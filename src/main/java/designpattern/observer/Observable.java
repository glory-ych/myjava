package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangch on 2016/10/11.
 */
public class Observable implements IObservable {
    private List<IObserver> list = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Observable() {
    }

    public Observable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("被观察者走路...");
        this.notifyall("走路");
    }

    @Override
    public void eat() {
        System.out.println("被观察者吃饭...");
        this.notifyall("吃饭");
    }

    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void del(IObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifyall(String action) {
        for (IObserver observer : list) {
            observer.action(action);
        }
    }
}
