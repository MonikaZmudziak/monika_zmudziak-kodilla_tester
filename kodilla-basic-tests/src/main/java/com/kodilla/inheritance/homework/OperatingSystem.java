package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turn on.");
    }

    public void turnOff() {
        System.out.println("Turn off.");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
