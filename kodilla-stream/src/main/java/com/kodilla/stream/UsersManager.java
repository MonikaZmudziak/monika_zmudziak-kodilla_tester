package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        //processUsersStream();

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }


//    private static void processUsersStream() {
//        UsersRepository.getUsersList()
//                .stream()
//                .map(User::getUsername)         // [1]
//                .forEach(username -> System.out.println(username));
//    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> usersOlderUserThanGivenAge(int givenAge){
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user->user.getAge()>givenAge)
                .collect(Collectors.toList());
        return users ;
    }



    public static List<User> filterUsersWithNumberOfPostEqualsZero() {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user ->user.getNumberOfPost()  == 0 )
                .collect(Collectors.toList());
      return users;
    }
}

