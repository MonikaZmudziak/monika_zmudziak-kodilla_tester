package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {


    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    private static Car drawCar() {
        Random random = new Random();

        int drawCarKind = random.nextInt(3);
        if (drawCarKind == 0)
            return new Ford(50);

        else if (drawCarKind == 1)
            return new Toyota(80);
        else
            return new Kia(100);

    }
}