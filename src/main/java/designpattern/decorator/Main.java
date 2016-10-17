package designpattern.decorator;

/**
 * Created by yangch on 2016/10/12.
 */
public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk();
        milk = new Decorator1(milk);
        milk = new Decorator2(milk);
        milk.operate();
    }
}
