package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(ForumStats.usersAveragePostAboveForty(UsersRepository.getUsersList()));
        System.out.println(ForumStats.usersAveragePostAboveForty(UsersRepository.getUsersList()));

    }


    public static double usersAveragePostAboveForty (List<User> userList){
            double usersAveragePostAboveForty = userList
                    .stream()
                    .filter(x -> x.getAge() >= 40) // przefiltrowany stream obiektów typu User
                    .map(user -> user.getNumberOfPost())// Stream postów typu int (bez możliwości operacji matematycznych - zwykły stream)
                    .mapToInt(post -> post)//stream tych samych postów tylko przekształocny na int stream - z możliwością operacji matematycznych
                    .average()
                    .orElse(0.0);


            return usersAveragePostAboveForty;

    }

    public static double usersAveragePostBelowForty (List<User> userList){
        double usersAverageBelowForty = userList
                .stream()
                .filter(user -> user.getAge() < 40)
                .map(user -> user.getNumberOfPost())
                .mapToInt(post->post)
                .average()
                .orElse(0.0);


        return usersAverageBelowForty;
    }

}