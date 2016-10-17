package designpattern.proxy.force;

/**
 * Created by yangch on 2016/10/13.
 */
public class Subject implements ISubject {
    @Override
    public void action() {
        if (isProxy()) {
            System.out.println("subject...");
        } else {
            System.out.println("请使用代理...");
        }
    }

    //强制代理
    private ISubject proxy;

    public boolean isProxy() {
        return this.proxy != null;
    }

    public ISubject getProxy() {
        this.proxy = new Proxy(this);
        return proxy;
    }
}
