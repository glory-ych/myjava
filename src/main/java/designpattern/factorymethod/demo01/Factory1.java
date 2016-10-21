package designpattern.factorymethod.demo01;

/**
 * Created by yangch on 2016/10/20.
 */
public class Factory1 implements IFactory {

    @Override
    public Pizza create() {
        return new Pizza1();
    }
}
