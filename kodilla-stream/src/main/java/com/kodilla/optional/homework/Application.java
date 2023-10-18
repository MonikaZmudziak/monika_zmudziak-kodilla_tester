package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Piotr Nowak", new Teacher("Anna Nowak")));
        students.add(new Student("Tomasz Nowakowski", null));
        students.add(new Student("Tomasz Kot", new Teacher("Jan Kowalski")));
        students.add(new Student("Monika Nowak", new Teacher("Adam Kowal")));
        students.add(new Student("Emil Nowakowski", null));

        Application app = new Application();
        app.getTeacherNames(students);
    }

    public String getTeacherName(Student student) {

        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        System.out.println("Student name: " + student.getName() + " Teacher name: " + teacherName);
        return teacherName;
    }



    public List<String> getTeacherNames(List<Student> students) {

        List<String> teacherNames = new ArrayList<>();

        for (Student student : students) { //dla każdego studenta z listy students
           String teacherName=getTeacherName(student);
           teacherNames.add(teacherName);
        }
        return teacherNames;
     }


}
