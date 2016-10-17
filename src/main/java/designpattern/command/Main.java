package designpattern.command;

/**
 * Created by yangch on 2016/10/14.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver=new ConcreteR1();
        Command command=new ConcreteC1(receiver);
        Invoker invoker=new Invoker(command);
        invoker.operate();
    }
}
