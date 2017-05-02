package com.glory.service.study.packIO;

import com.glory.service.study.People;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by yangch on 2017/3/28 0028.
 */
public class Main1 {
    @Test
    public void demo08() throws IOException {
        OutputStream outputStream=new ObjectOutputStream(new ByteArrayOutputStream());
    }
    @Test
    public void demo07() {
        File file=new File("src/main/resources/ext.txt");
        System.out.println(file.exists());
    }

    @Test
    public void demo06() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\myjava\\service\\src\\main\\resources\\ext.txt"));
        String cont;
        while ((cont = bufferedReader.readLine()) != null) {
            System.out.println(cont);
        }


    }

    @Test
    public void demo05() throws Exception {
        byte[] arr = new byte[]{1, 2, 3};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int temp;
        byte[] buf = new byte[1024];
        while ((temp = byteArrayInputStream.read(buf)) != -1) {
            for (int i = 0; i < temp; i++) {
                System.out.println(buf[i]);
            }
        }
    }

    @Test
    public void demo04() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:/ext.txt");
        byte[] bytes = new byte[1024];
        int temp;
        while ((temp = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, temp));
        }
    }

    @Test
    public void demo03() throws Exception {
        People people = new People();
        people.setName("ych");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
        objectOutputStream.writeObject(people);
    }

    @Test
    public void demo02() {
        byte[] arr = new byte[]{1, 2, 3};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(arr);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            int temp;
            while ((temp = inputStream.read()) != -1) {
                System.out.println(temp + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test01() throws Exception

    {

//        File file = new File("ext.txt");
        InputStream inputStream = Main1.class.getClassLoader().getResourceAsStream("ext.txt");
//        int temp;
//        while ((temp = inputStream.read()) != -1) {
//            System.out.println(temp);
//        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "GBK");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            System.out.println(text);
        }
    }
}
