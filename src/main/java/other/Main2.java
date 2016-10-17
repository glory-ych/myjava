package other;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yangch on 2016/10/14.
 */
public class Main2 {
    @Test
    public void demo01() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, -20);//日期减20天
        Date before20Day = calendar.getTime();
        System.out.println(format.format(before20Day));
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, -10);//日期减10天
        Date before10Day = calendar.getTime();
        System.out.println(format.format(before10Day));
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, 10);//日期加10天
        Date after10Day = calendar.getTime();
        System.out.println(format.format(after10Day));
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, 20);//日期加20天
        Date after20Day = calendar.getTime();
        System.out.println(format.format(after20Day));
    }
}
