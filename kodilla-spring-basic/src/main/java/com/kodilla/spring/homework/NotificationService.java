package com.kodilla.spring.homework;

public interface NotificationService {

    void success(String address);

    void fail(String address);
}