package designpattern.singleton;

/**
 * Created by yangch on 2016/10/8.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("thread..." + Thread.currentThread().getName() + ",singleton..." + SingleDoubleLock.getInstance());
//                    System.out.println("thread..." + Thread.currentThread().getName() + ",singleton..." + SingletonEnum.NEWINSTATCE.print());

//                    System.out.println("thread..." + Thread.currentThread().getName() + ",singleton..." + SingletonLazy.newInstance());
                }
            }).start();
        }
    }
}
