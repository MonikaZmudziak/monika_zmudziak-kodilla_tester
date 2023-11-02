package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double add = a + b;
        display.display(add);
        return add;
    }

    public double subtract(double a, double b) {
        double subtract = a - b;
        display.display(subtract);
        return subtract;
    }

    public double multiply(double a, double b) {
        double multiply = a * b;
        display.display(multiply);
        return multiply;
    }

    public double divide(double a, double b) {
        double divide = a / b;
        display.display(divide);
        return divide;
    }
}