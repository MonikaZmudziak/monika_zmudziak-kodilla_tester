import java.util.Random;

public class RandomNumbers {

    int min;
    int max;

    public RandomNumbers() {
        min = 31; // startowa poza zakrsem warości musi byc
    }

    public void generateRandomNumbers() {
        Random random = new Random();
        int sum = 0;

        while (sum < 5000) {
            int newNumber = random.nextInt(31); // losuje liczby od 0-30
            sum = sum + newNumber;

            if (newNumber < min) {
                min = newNumber;
            }

            if (newNumber > max) {
                max = newNumber;
            }
        }
    }

    public int minValue() {
        return min;
    }

    public int maxValue() {
        return max;
    }

}




