package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFromWhenFlightExist() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Warsaw", "Dublin"));
        expected.add(new Flight("Warsaw", "Berlin"));

        // when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testFindFlightsToWhenFlightExist() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Warsaw", "Berlin"));

        // when
        List<Flight> result = flightFinder.findFlightsTo("Berlin");

        // then
        assertEquals(expected, result);
    }
    @Test
    public void testFindFlightsFromWhenFlightNotExist() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> expected = new ArrayList<>();

        // when
        List<Flight> result = flightFinder.findFlightsFrom("Brazil");

        // then
        assertEquals(expected, result);
    }git

    @Test
    public void testFindFlightsToWhenFlightNotExist() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> expected = new ArrayList<>();

        // when
        List<Flight> result = flightFinder.findFlightsTo("Brazil");

        // then
        assertEquals(expected, result);
    }
}