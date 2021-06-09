package com.aks.springbootdemo.aopeg2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.List;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private ObjectWriter objectWriter = new ObjectMapper().writerWithDefaultPrettyPrinter();

    @Before("execution(* *.*(..))")
    public void before() {
        logger.info("Entering method");
    }

    @After("execution(* *.*(..))")
    public void after() {
        logger.info("Exiting method");
    }

    @Around("execution(* *.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        List<Object> args = List.of(proceedingJoinPoint.getArgs());
        logger.info(String.format("Calling method : %s with arguments : %s", methodName,
                objectWriter.writeValueAsString(args)));
        Object returnedObject = proceedingJoinPoint.proceed();
        logger.info(String.format("Exiting method : %s with response : %s", methodName, returnedObject));
        return returnedObject;
    }
}
