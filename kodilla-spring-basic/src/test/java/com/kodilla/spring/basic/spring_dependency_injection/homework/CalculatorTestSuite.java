package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {


    @Test
    public void testAddResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        int a = 20;
        int b = 10;
        double add = bean.add(a, b);
    }

    @Test
    public void testSubtractResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        int a = 20;
        int b = 10;
        double subtract = bean.subtract(a, b);
    }

    @Test
    public void testMultiplyResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        int a = 20;
        int b = 10;
        double multiply = bean.multiply(a, b);
    }

    @Test
    public void testDivideResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        int a = 20;
        int b = 10;
        double divide = bean.divide(a, b);
    }


}