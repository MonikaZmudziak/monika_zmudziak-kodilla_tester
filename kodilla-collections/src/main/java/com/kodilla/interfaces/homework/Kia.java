package com.kodilla.interfaces.homework;

public class Kia implements Car{

    public int speed;
    public Kia(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 30;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed -18;

    }
}
