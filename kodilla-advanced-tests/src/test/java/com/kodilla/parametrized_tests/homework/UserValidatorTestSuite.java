package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"monika", "monika3", "MonikA-", "M_o-ni1A"})
    public void shouldTestCorrectCharactersUsername(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {" ", "M o n i k a"})
    public void shouldTestUncorrectCharactersUsername(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"monika@o2.com", "monik@wp.pl","monik@gmail.com"})
    public void shouldTestCorrectCharactersEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"monika.wp.pl", "monika@@gmail","M"})
    public void shouldTestUncorrectCharactersEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }
}



