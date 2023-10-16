package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void testUsersAveragePostAboveForty() {
        //given
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 40, 10, "Chemists"));
        users.add(new User("Jessie Pinkman", 55, 20, "Sales"));

        double expected = 15;

        //when
        double result = ForumStats.usersAveragePostAboveForty(users);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void testUsersAveragePostAboveFortyWhenThereAreNoUsers() {
        //given
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 12, 10, "Chemists"));
        users.add(new User("Jessie Pinkman", 39, 20, "Sales"));

        double expected = 0;

        //when
        double result = ForumStats.usersAveragePostAboveForty(users);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void testUsersAveragePostBelowForty() {
        //given
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 70, 10, "Chemists"));
        users.add(new User("Jessie Pinkman", 33, 20, "Sales"));

        double expected = 20;

        //when
        double result = ForumStats.usersAveragePostBelowForty(users);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void testUsersAveragePostBelowFortyWhenThereAreNoUsers() {
        //given
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 40, 10, "Chemists"));
        users.add(new User("Jessie Pinkman", 41, 20, "Sales"));

        double expected = 0;

        //when
        double result = ForumStats.usersAveragePostBelowForty(users);
        //then
        assertEquals(expected, result);
    }
}