package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        UsersManager usersManager = new UsersManager();
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();

        //then
        assertEquals(expected, result);
    }

    @Test
    public void testUsersOlderThanForty() {
        //given
        UsersManager usersManager = new UsersManager();
        List<User> expected = new ArrayList<>();
        expected.add(new User("Walter White", 50, 7, "Chemists"));
        expected.add(new User("Gus Firing", 49, 0, "Board"));
        expected.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expected.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<User> result = UsersManager.usersOlderUserThanGivenAge(40);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void testFilterUsersWithNumberOfPostEqualsZero() {
        //given
        UsersManager usersManager = new UsersManager();
        List<User> expected = new ArrayList<>();
        expected.add(new User("Gus Firing", 49, 0, "Board"));
        expected.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<User> result = UsersManager.filterUsersWithNumberOfPostEqualsZero();
        //then
        assertEquals(expected, result);
    }
}