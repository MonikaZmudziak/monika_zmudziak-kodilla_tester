package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class GradesTestSuit {
    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);//czy tablica z ocenami jest pusta
    }

    @Test
    public void shouldAddTwoElementsToArray() { //czy po dodaniu dwóch ocen tablica ma odpowiedni rozmiar oraz czy znajdują się w niej dodane wartości.
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }

////    @Test
////    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
////        Grades grades = new Grades();
////        assertEquals(0,grades.getAverage(),0.0001);
//
//    }
}