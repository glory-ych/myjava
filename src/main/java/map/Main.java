package map;

import org.junit.Test;

import java.util.List;

/**
 * Created by yangch on 2016/9/8.
 */
public class Main {
    @Test
    public void demo01() {
        MyHashMap<String, List<String>> myHashMap = MyHashMap.getInstance();
        System.out.println(myHashMap);
    }
}
