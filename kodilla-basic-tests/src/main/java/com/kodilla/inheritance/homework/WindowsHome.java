package com.kodilla.inheritance.homework;

public class WindowsHome extends OperatingSystem {

    public WindowsHome(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Turn on a Windows Home system");
    }
    @Override
    public void turnOff() {
        System.out.println("Turn off a Windows Home system");
    }
}


