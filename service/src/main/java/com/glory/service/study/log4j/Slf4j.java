package com.glory.service.study.log4j;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.net.URL;

/**
 * Created by yangch on 2017/2/27 0027.
 */
public class Slf4j {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("before trace");
        logger.debug("before debug");
        logger.info("before info");
        logger.warn("before warn");
        logger.error("before error");

//        PropertiesConfigurationBuilder.newConfigurationBuilder().addProperty("log4j.configurationFile", Slf4j.class.getClassLoader().getResource("").getPath() + "log/log4j2.xml");
        //PropertyConfigurator.configure(Slf4j.class.getClassLoader().getResource("").getPath() + "log/log4j.properties");
//        System.setProperty("log4j.configuration",Main.class.getClassLoader().getResource("").getPath() + "log/log4j.properties");
        System.out.println("**********************");
        //System.setProperty("log4j.configurationFile", "/log/log4j2.xml");
        //System.out.println(System.getProperty("log4j.configurationFile"));
//        String path = Slf4j.class.getClassLoader().getResource("log4j2.xml").getPath();
        URL url = Slf4j.class.getClassLoader().getResource("log4j2.xml");
//        System.setProperty("log4j.configurationFile", path);
//        LoggerContext context =(LoggerContext) LogManager.getContext(false);
//        context.reconfigure();
        try {
            ConfigurationSource source = new ConfigurationSource(new FileInputStream(url.getPath()));
            Configurator.initialize(null, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Logger logger2 = LoggerFactory.getLogger(Slf4j.class);
        logger2.trace("after trace");
        logger2.debug("after debug");
        logger2.info("after info");
        logger2.warn("after warn");
        logger2.error("after error");

    }
}
