package com.glory.service.study.properties;

import com.glory.service.study.People;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by yangch on 2017/3/21 0021.
 */
public class Demo03 {
    @Test
    public void demo01() throws Exception {
        People people = People.getInstance();
        File file = new File("people.out");

        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        oout.writeObject(people);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object obj = oin.readObject(); // 没有强制转换到Person类型
        oin.close();
        System.out.println("people..." + obj);

//        System.out.println(people);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(baos);
//        oos.writeObject(people);
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
//        People people1 = (People) ois.readObject();
//        System.out.println(people1);


//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//
//        URL url = classLoader.getResource("my text.txt");
//        System.out.println(url.getPath());
//        URI uri = url.toURI();
//        System.out.println(uri.getPath());
////        File file = new File("E:\\text.txt");
////        InputStream inputStream = this.getClass().getResourceAsStream("E:\\text.txt");
////        System.out.println(url.getPath());
//        Properties properties = new Properties();
////        properties.load(new FileInputStream(file));
//        properties.load(new FileInputStream(url.toURI().getPath()));
//        System.out.println(properties.getProperty("name"));
    }
}
