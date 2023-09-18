public class RandomNumbersMain {
    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateRandomNumbers();

        System.out.println(randomNumbers.minValue());
        System.out.println(randomNumbers.maxValue());


    }

}
