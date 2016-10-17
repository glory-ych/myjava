package designpattern.factorymethod;

/**
 * Created by yangch on 2016/10/9.
 */
public class YellowHumanFactory implements Factory {
    @Override
    public Human create() {
        return new YellowHuman();
    }
}
