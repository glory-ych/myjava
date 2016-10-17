package designpattern.proxy.common;

/**
 * Created by yangch on 2016/10/13.
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = new Subject();
        Proxy proxy = new Proxy(subject);
        proxy.action();
    }
}
