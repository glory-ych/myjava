package com.glory.service.study.spring.frame;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by yangch on 2016/11/7 0007.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //MyConfigurableApplicationContext myConfigurableApplicationContext=new MyConfigurableApplicationContext();
        //myConfigurableApplicationContext.start();
        applicationContext.start(); //触发ContextStartedEvent事件
        applicationContext.stop();  //触发ContextStoppedEvent事件
        applicationContext.close(); //关闭容器，触发ContextClosedEvent事件
        applicationContext.refresh();
        //System.out.println(applicationContext.getBean("couponTempServiceImpl"));
        //UserService userService= (UserService) applicationContext.getBean("userService");
        //userService.print();
        //HashMap hashMap=new HashMap();
       // Hashtable hashtable=new Hashtable();
    }

    /**
     * 序列化拷贝对象
     */
    public void serializable2clone(){
        CouponTemp couponTemp=new CouponTemp();
        couponTemp.setFaceValue(1000);
        try {
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(couponTemp);
            objectOutputStream.close();
            byteArrayOutputStream.close();

            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
            CouponTemp c1= (CouponTemp) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            System.out.println(c1.getFaceValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
