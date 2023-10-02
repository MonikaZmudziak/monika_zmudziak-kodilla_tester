package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class GeneralCarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(80);
        cars.add(ford);
        cars.add(new Toyota(100));
        cars.add(new Kia(120));

        cars.remove(1);
        cars.remove(ford);

        System.out.println(cars.size());


        for (Car car : cars) {
            CarUtils.describeCar(car);

        }
    }
}
