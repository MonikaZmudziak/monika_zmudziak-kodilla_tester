package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School johnSchool = new School("School1",Arrays.asList(20,15,30));
        School jessieSchool = new School("School3",Arrays.asList(30,31));
        School bartSchool = new School("School5", Arrays.asList(20,25,31));

        school.put(john, johnSchool);
        school.put(jessie, jessieSchool);
        school.put(bart, bartSchool);

        System.out.println(school.get(john));
        System.out.println(school.get(jessie));
        System.out.println(school.get(bart));


        for (Map.Entry<Principal, School> schools : school.entrySet()) {
            String schoolDescription = schools.getKey() + " -> " + schools.getValue().description();
            System.out.println(schoolDescription);
        }
    }
}
