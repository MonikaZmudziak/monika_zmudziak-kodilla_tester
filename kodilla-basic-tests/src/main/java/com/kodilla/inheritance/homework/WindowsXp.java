package com.kodilla.inheritance.homework;

public class WindowsXp extends OperatingSystem {

    public WindowsXp(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Turn on a Windows XP system");
    }
    @Override
    public void turnOff() {
        System.out.println("Turn off a Windows XP system");
    }
}
