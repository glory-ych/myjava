package designpattern.proxy.force;

/**
 * Created by yangch on 2016/10/13.
 */
public class Proxy implements ISubject {
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        System.out.println("proxy start...");
        subject.action();
        System.out.println("proxy end...");
    }

    @Override
    public ISubject getProxy() {
        return null;
    }
}
