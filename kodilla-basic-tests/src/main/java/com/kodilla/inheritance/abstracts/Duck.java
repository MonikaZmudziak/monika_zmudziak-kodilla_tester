package com.kodilla.inheritance.abstracts;

import com.kodilla.inheritance.abstracts.Animal;

public class Duck extends Animal {

    public Duck() {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}