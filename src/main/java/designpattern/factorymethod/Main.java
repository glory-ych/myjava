package designpattern.factorymethod;

/**
 * Created by yangch on 2016/10/9.
 */
public class Main {
    public static void main(String[] args) {
        Factory wfactory = new WhiteHumanFactory();
        Human human = wfactory.create();
        human.say();
    }
}
