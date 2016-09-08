package map;

import java.util.HashMap;

/**
 * Created by yangch on 2016/9/8.
 */
public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("name", "ych");
        System.out.println(myHashMap.get("name"));
    }
}
