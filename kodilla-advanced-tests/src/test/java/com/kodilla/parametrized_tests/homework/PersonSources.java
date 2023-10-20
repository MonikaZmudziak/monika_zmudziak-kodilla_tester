package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments>shouldCalculatePersonBMI() {
        return Stream.of(
                Arguments.of(new Person(1.60, 30), "Very severely underweight"),
                Arguments.of(new Person(1.60, 39), "Severely underweight"),
                Arguments.of(new Person(1.60, 47), "Underweight"),
                Arguments.of(new Person(1.60, 48), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 72),"Overweight"),
                Arguments.of(new Person(1.60, 89),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.60, 95), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.60, 110), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.60, 120), "Obese Class IV (Morbidly Obese)")
        );
    }
}
