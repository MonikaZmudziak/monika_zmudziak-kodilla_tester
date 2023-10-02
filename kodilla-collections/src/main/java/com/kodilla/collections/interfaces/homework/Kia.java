package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Kia{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
