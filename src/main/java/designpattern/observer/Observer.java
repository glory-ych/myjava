package designpattern.observer;

/**
 * Created by yangch on 2016/10/11.
 */
public class Observer implements IObserver {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public Observer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void action(String action) {
        System.out.println("被观察者在[" + action + "]，观察者[" + this.name + "]开始行动...");
    }

}
