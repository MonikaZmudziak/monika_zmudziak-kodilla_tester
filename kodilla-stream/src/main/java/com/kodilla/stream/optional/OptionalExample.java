package com.kodilla.stream.optional;

import com.kodilla.stream.User;

import java.util.Optional;

//Optional - czy jakaś zmienna nie zwraca wartości null


public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
//
//    User user = null;                                             // [1]
//
//    Optional<User> optionalUser = Optional.ofNullable(user);
//
//    String username =
//            optionalUser.orElse(new User("", 0, 0, "")).getUsername();
//
//      System.out.println(username);

}