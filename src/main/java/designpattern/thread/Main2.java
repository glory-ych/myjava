package designpattern.thread;

/**
 * Created by yangch on 2016/10/19.
 */
public class Main2 {
    private static int age = 1;

    public static void main(String[] args) {
        Main2 main2 = new Main2();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                main2.test1();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                main2.test2();
//            }
//        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                main2.test3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test4();
            }
        }).start();
    }

    public synchronized void test1() {
        System.out.println(Thread.currentThread().getName() + "...test1..." + System.currentTimeMillis() + "..." + age);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test2() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "...test2..." + System.currentTimeMillis() + "..." + age);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void test3() {
        synchronized (Main2.class) {
            System.out.println(Thread.currentThread().getName() + "...test3..." + System.currentTimeMillis() + "..." + age);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void test4() {
        System.out.println(Thread.currentThread().getName() + "...test4..." + System.currentTimeMillis() + "..." + age);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
