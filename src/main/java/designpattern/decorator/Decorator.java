package designpattern.decorator;

/**
 * Created by yangch on 2016/10/12.
 */
public abstract class Decorator extends Milk {
    Milk milk = null;

    public Decorator() {
    }

    public Decorator(Milk milk) {
        this.milk = milk;
    }

    public void operate() {
        milk.operate();
    }
}
