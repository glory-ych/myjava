package designpattern.proxy.dynamic;

/**
 * Created by yangch on 2016/10/13.
 */
public class DynamicRealSubject implements DynamicSubject {
    @Override
    public void action() {
        System.out.println("subject...");
    }
}
