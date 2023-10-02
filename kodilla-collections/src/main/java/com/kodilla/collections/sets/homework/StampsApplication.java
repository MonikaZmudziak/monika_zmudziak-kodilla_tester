package com.kodilla.collections.sets.homework;


import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp( "King Kong", 4.33, 2.4, false));
        stamps.add(new Stamp( "Avatar", 3.12, 5,true));
        stamps.add(new Stamp( "Dracula", 4.44, 4, true));
        stamps.add(new Stamp( "Super Star", 3,2, false));
        stamps.add(new Stamp( "King Kong", 4.33, 2.4, false));
        stamps.add(new Stamp( "Avatar", 3.12, 5,true));


        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
