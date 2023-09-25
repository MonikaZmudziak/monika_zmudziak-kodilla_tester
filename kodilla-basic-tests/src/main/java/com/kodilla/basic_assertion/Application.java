package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 18;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(26, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }


        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtractResult = ResultChecker.assertEquals(-10, subtractResult);

        if (correctSubtractResult) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctSquareResult = ResultChecker.assertEquals(64, squareResult);

        if (correctSquareResult) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}
