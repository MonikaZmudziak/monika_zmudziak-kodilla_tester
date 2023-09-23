package com.kodilla.inheritance.abstracts.homework;

public class Square extends Shape {

    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double circumference() {
        return 4 * a;
    }
}
