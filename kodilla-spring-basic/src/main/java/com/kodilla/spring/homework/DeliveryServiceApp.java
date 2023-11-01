package com.kodilla.spring.homework;

public class DeliveryServiceApp implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("package too heavy");
            return false;
        }
        System.out.println("delivering in progress...");
        return true;
    }
}