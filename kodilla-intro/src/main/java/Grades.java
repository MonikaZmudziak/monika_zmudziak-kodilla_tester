public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size=0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade (){
        int value = this.grades[this.size-1];
        return value;

    }

    public float gradesAverage(){

        float average = (this.grades[0]+this.grades[1]+this.grades[2]+this.grades[3]+this.grades[4]+this.grades[5]
                +this.grades[6]+this.grades[7]+this.grades[8]+this.grades[9])/10f;
        return average;

    }

}





//    int[] grades = new int [10]