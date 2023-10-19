package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {


    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineValues_Valid.csv")
    public void testValidUserNumbers(int num1, int num2, int num3, int num4, int num5, int num6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        assertDoesNotThrow(() -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineValues_Invalid.csv")
    public void testInvalidUserNumbers(int num1, int num2, int num3, int num4, int num5, int num6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    static Stream<Set<Integer>> invalidNumberCount() {
        return Stream.of(
                Set.of(1, 2, 3, 4, 5, 6, 7),
                Set.of(1, 2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.GamblingMachineTestSuite#invalidNumberCount")
    public void testInvalidNumberCount(Set<Integer> input) {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(input));
    }
}