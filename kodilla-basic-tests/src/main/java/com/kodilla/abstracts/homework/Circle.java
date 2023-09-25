package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    double r;
    static final double PI = 3.1415927;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double circumference() {
        return 2 * PI * r;
    }
}


