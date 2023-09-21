import java.util.Scanner;

public class Colors {
    public static String getColors() {


        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine().trim().toUpperCase();

        System.out.println("Select color (R-Red, B-Blue, G-Green, Y-Yellow):");
        switch (color) {
            case "R":
                return "Red";
            case "B":
                return "Blue";
            case "G":
                return "Green";
            case "Y":
                return "Yellow";
            default:
                System.out.println("Try again.");

        }
        return color;
    }
}
