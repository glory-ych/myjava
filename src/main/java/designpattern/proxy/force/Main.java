package designpattern.proxy.force;

/**
 * Created by yangch on 2016/10/13.
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = new Subject();
        //DynamicProxy proxy = new DynamicProxy(subject);
        ISubject proxy = subject.getProxy();
        proxy.action();
    }
}
