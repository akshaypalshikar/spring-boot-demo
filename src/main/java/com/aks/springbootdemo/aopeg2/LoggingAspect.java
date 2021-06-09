package com.aks.springbootdemo.aopeg2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Before("execution(* *.*(..))")
    public void before(){
        logger.info("Entering method");
    }

    @After("execution(* *.*(..))")
    public void after(){
        logger.info("Exiting method");
    }
}
