package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {


   private boolean isHeadlightsTurnedOn;
    @Override
    public void setHeadlightsTurnedOn(boolean headlightsTurnedOn) {
        isHeadlightsTurnedOn = headlightsTurnedOn;
    }


    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
