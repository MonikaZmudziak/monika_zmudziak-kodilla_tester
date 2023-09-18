public class GradesTests {
    public static void main(String[] args) {


        Grades grades = new Grades();

        grades.add(1);
        grades.add(1);
        grades.add(5);
        grades.add(5);
        grades.add(0);


        System.out.println(grades.lastGrade());
        System.out.println(grades.gradesAverage());
    }
}
