package designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangch on 2016/10/17.
 */
public class Dog {
    protected Map<String, String> getDogName() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "机器狗");
        return map;
    }
}
