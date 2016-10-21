package effectivejava.chapter4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yangch on 2016/10/17.
 */
public class MixChange {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(new Date()));
    }
}
