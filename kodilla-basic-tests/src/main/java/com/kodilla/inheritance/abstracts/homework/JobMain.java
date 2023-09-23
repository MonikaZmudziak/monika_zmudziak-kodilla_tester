package com.kodilla.inheritance.abstracts.homework;

import javax.print.Doc;

public class JobMain {
    public static void main(String[] args) {

        Doctor doctor = new Doctor(5000);
        Teacher teacher  = new Teacher(3000);

        Person Adam = new Person("Adam",30, doctor);
        Adam.showDuties();
        Adam.showSalary();



        Person Jan = new Person("Jan",35, teacher);
        Jan.showDuties();
        Jan.showSalary();

    }
}
