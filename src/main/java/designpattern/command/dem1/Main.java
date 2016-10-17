package designpattern.command.dem1;

/**
 * Created by yangch on 2016/10/14.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new Command(receiver);
        Invoker invoker = new Invoker(command);
        invoker.operate();
    }
}
