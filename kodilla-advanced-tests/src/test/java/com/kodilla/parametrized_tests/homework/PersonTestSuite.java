package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#shouldCalculatePersonBMI")
    public void testPersonBMI (Person input, String expected) {
        assertEquals(input.getBMI(),expected);
        System.out.println(input.getBMI());
    }
}