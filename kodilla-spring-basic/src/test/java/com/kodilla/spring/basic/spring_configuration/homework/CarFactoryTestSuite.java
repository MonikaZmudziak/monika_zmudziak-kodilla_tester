package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CarFactoryTestSuite {

    @Test
    public void testChoosingCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean(Car.class);
        String carType = car.getCarType();
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void testTurningTheHeadlights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean(Car.class);

        car.setHeadlightsTurnedOn(true);
        Assertions.assertEquals(true, car.hasHeadlightsTurnedOn());
    }
}