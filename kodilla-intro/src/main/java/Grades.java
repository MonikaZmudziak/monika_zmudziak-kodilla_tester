public class Grades {
    private int[] grades;
    private int size; // ile dodałam do tablicy elementów

    public Grades() { // tablica 10 ocen
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        int value = this.grades[this.size - 1];
        return value;

    }

    public float gradesAverage() {

        int sum = 0;


        for (int i = 0; i <= size - 1; i++) {
            sum = sum + grades[i];
        }
        float average = sum / (float) size;

        return average;
    }
}


//    int[] grades = new int [10]