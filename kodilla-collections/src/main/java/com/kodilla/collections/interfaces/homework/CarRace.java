package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        System.out.println("FORD:");
        Ford ford = new Ford(50);
        doRace(ford);
        System.out.println("TOYOTA:");
        Toyota toyota = new Toyota(80);
        doRace(toyota);
        System.out.println("KIA:");
        Kia kia = new Kia(100);
        doRace(kia);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Speed: " + car.getSpeed() + " km/h");

    }
}
