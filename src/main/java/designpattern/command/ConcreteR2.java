package designpattern.command;

/**
 * Created by yangch on 2016/10/14.
 */
public class ConcreteR2 implements Receiver {

    @Override
    public void operate() {
        System.out.println("r2 operate...");
    }
}
