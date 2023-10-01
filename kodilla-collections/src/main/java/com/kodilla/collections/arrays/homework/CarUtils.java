package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar(Car car) { //metoda statyczna opisująca samochody
        System.out.println("-----------------------------");
        System.out.println("Car " + getCarName(car));
        System.out.println("Speed :" + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Kia)
            return "Kia";
        else
            return "Unknown car name";

    }

}
