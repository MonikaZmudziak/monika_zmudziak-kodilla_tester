package com.kodilla.inheritance.abstracts.homework;

public class Application {
    public static void main(String[] args) {


        Square square = new Square(4);
        System.out.println("Square area: " + square.area());
        System.out.println("Square circumference: " + square.circumference());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Square circumference: " + rectangle.area());
        System.out.println("Rectangle circumference: " + rectangle.circumference());

        Circle circle = new Circle(2.4);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle circumference: " + circle.circumference());
    }
}
