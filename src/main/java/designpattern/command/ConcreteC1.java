package designpattern.command;

/**
 * Created by yangch on 2016/10/14.
 */
public class ConcreteC1 extends Command {
    public ConcreteC1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void operate() {
        receiver.operate();
    }
}
