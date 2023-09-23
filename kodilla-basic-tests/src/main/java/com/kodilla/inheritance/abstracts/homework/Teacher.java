package com.kodilla.inheritance.abstracts.homework;

public class Teacher extends Job{

    public Teacher(double salary){
        super(salary);
        this.responsibilities = "Teacher teaches students";
    }
}
