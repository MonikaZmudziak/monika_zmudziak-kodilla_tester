package com.kodilla.stream.optional.homework;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.SynthTableUI;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testGetTeacherNames() {
        //given
        Application application = new Application();
        List<String> expected = new ArrayList<>();
        expected.add("Anna Nowak");
        expected.add("<undefined>");
        expected.add("Jan Kowalski");
        expected.add("Adam Kowal");
        expected.add("<undefined>");

        //when
        List<Student> students = new ArrayList<>();
        students.add(new Student("Piotr Nowak", new Teacher("Anna Nowak")));
        students.add(new Student("Tomasz Nowakowski", null));
        students.add(new Student("Tomasz Kot", new Teacher("Jan Kowalski")));
        students.add(new Student("Monika Nowak", new Teacher("Adam Kowal")));
        students.add(new Student("Emil Nowakowski", null));


        List<String> result = application.getTeacherNames(students);

       //then
        assertEquals(expected, result);
    }

}