package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.concurrent.RecursiveTask;

@Configuration
public class CarFactory {

    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }


    @Bean
    public Car chooseCar() {
        Season season = getSeason();
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        Car car = null;
        boolean headlinesState = shouldTurnOnHeadLights(hour);


        switch (season) {
            case SPRING:
                car = new Sedan();
                break;
            case SUMMER:
                car = new Cabrio();
                break;
            case AUTUMN:
                car = new Sedan();
                break;
            case WINTER:
                car = new Suv();
                break;
        }

        car.setHeadlightsTurnedOn(headlinesState);

        return car;
    }

    private Season getSeason() {
        switch(LocalDate.now().getMonth()){

            case JANUARY -> {
                return Season.WINTER;
            }
            case FEBRUARY -> {
                return Season.WINTER;
            }
            case MARCH -> {
                return Season.SPRING;
            }
            case APRIL -> {
                return Season.SPRING;
            }
            case MAY -> {
                return Season.SPRING;
            }
            case JUNE -> {
                return Season.SUMMER;
            }
            case JULY -> {
                return Season.SUMMER;
            }
            case AUGUST -> {
                return Season.SUMMER;
            }
            case SEPTEMBER -> {
                return Season.AUTUMN;
            }
            case OCTOBER -> {
                return Season.AUTUMN;
            }
            case NOVEMBER -> {
                return Season.AUTUMN;
            }
            case DECEMBER -> {
                return Season.WINTER;
            }
        }
        return null;
    }

    public boolean shouldTurnOnHeadLights(int hour){
        if(hour<6.00 || hour>=20.00){
            return true;
        }else{
            return false;
        }
    }
}
