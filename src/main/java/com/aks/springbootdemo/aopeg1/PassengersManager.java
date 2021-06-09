package com.aks.springbootdemo.aopeg1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengersManager {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aopeg1/aop.xml");

        PassengerDao passengerDao = (PassengerDao)context.getBean("passengerDao");
        System.out.println(passengerDao.getPassenger(1));

        context.close();
    }

}
