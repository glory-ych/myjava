package thread;

import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by yangch on 2016/9/29.
 */
public class demo01 {
    private static volatile int a = 0;

    public static void main(String[] args) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        TaskExecutor taskExecutor;
        new Thread(new Runnable() {
            public void run() {
                read();
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                write();
            }
        }).start();

    }

    private static void write() {
        System.out.println("write...");
        a = 1;
    }

    private static void read() {
        System.out.println("read...");
        System.out.println(a);
    }
}
