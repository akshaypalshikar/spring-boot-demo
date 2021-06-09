package com.aks.springbootdemo.aopeg1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class PassengersManager {

    private static Logger logger = Logger.getLogger(PassengersManager.class.getName());

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aopeg1/aop.xml");

        PassengerDao passengerDao = (PassengerDao)context.getBean("passengerDao");
        logger.info(passengerDao.getPassenger(1).toString());

        context.close();
    }

}
