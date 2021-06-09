package com.aks.springbootdemo.aopeg1;

import java.util.logging.Logger;

public class LoggingAspect {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    public void before(){
        logger.info("Entering method");
    }

    public void after(){
        logger.info("Exiting method");
    }
}
