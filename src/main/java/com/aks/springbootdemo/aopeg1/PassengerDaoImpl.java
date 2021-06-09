package com.aks.springbootdemo.aopeg1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PassengerDaoImpl implements PassengerDao {

    private static Map<Integer, Passenger> passengerMap = new ConcurrentHashMap<>();

    @Override
    public Passenger getPassenger(int id) {
        if (passengerMap.get(id) != null) {
            return passengerMap.get(id);
        }
        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        return passenger;
    }
}
