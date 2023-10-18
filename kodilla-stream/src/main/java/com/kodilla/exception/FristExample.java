package com.kodilla.exception;

import javax.sql.rowset.FilteredRowSet;

public class FristExample {
    public static void main(String[] args) {

        String username = "Willy Wonka";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
    }
}
