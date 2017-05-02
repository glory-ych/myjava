package com.glory.service.study.log4j;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class Main {
    //private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static Logger logger = LoggerFactory.getLogger(Main.class);

//    static {
//        String path = Main.class.getClassLoader().getResource("").getPath();
//        System.setProperty("log4j.configuration", "file:" + path + "/log/log4j.properties");//-Dlog4j.configuration=file:log/log4j.properties
//        logger = LogManager.getLogger(Main.class);
//    }

    public static void main(String[] args) {
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        logger.trace("before trace");
        logger.debug("before debug");
        logger.info("before info");
        logger.warn("before warn");
        logger.error("before error");
        System.out.println("********************");
        //System.out.println(Main.class.getClassLoader().getResource("log/log4j.properties").getPath());
        //PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log/log4j2.xml"));
//        System.setProperty("log4j.configuration", Main.class.getClassLoader().getResource("log/log4j.properties").getPath());
//        logger.trace("after trace");
//        logger.debug("after debug");
//        logger.info("after info");
//        logger.warn("after warn");
//        logger.error("after error");
    }

    @Test
    public void demo01() {
        String path = Main.class.getClassLoader().getResource("").getPath();
        System.out.println(path);
    }
}
