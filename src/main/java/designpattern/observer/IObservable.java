package designpattern.observer;

/**
 * Created by yangch on 2016/10/11.
 */
public interface IObservable {
    void run();
    void eat();
    void add(IObserver observer);
    void del(IObserver observer);
    void notifyall(String action);
}
