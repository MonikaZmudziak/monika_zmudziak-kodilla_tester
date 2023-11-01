package com.kodilla.spring.homework;

public class NotificationServiceApp implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("not delivered to: " + address);
    }
}