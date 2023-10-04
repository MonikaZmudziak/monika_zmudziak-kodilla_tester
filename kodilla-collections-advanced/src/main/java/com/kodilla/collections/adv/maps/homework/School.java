package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String schoolName;
    private List<Integer> studentsCount;


    public School(String schoolName, List<Integer> studentsCount) {
        this.schoolName = schoolName;
        this.studentsCount = studentsCount;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentsCount() {
        return studentsCount;
    }
    public int allStudents() {
        int sum = 0;
        for (int schools : studentsCount)
            sum += schools;
        return sum ;
    }
    public String description() {
        return schoolName + " : " + allStudents();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) && Objects.equals(studentsCount, school.studentsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, studentsCount);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsCount=" + studentsCount +
                '}';
    }
}