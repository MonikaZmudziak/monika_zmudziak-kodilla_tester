package com.kodilla.inheritance.homework;

public class OperatingSystemMain {
    public static void main(String[] args) {

        WindowsHome windowsHome = new WindowsHome(2000);
        windowsHome.turnOn();
        windowsHome.turnOff();
        System.out.println(windowsHome.getYear());


        WindowsXp windowsXp = new WindowsXp(1998);
        windowsXp.turnOn();
        windowsXp.turnOff();
        System.out.println(windowsXp.getYear());
    }
}
