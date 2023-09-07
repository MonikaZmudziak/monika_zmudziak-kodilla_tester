public class LeapYear {
    public static void main(String[] args) {

        int year = 1997;


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("LEAP YEAR");
                } else {
                    System.out.println("It's not leap year");
                }
            } else {
                System.out.println("LEAP YEAR");
            }
        } else {
            System.out.println("It's not leap year");
        }
    }
}


//
//        1997 is not a leap year (not divisible by 4)
//        1996 is a leap year (divisible by 4)
//        1600 is a leap year (divisible by 400)
//        1800 is not a leap year (divisible by 4, divisible by 100, NOT divisible by 400)