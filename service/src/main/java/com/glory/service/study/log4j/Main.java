package com.glory.service.study.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yangch on 2017/2/13 0013.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

//    @Test
//    public void demo01() {
//        logger.trace("trace");
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");
//        logger.error("error");
//    }
}
