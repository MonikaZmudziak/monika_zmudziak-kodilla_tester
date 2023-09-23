public class LeapYear {
    public static void main(String[] args) {

//        int year = 1800;


//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("LEAP YEAR");
//                } else {
//                    System.out.println("It's not leap year");
//                }
//            } else {
//                System.out.println("LEAP YEAR");
//            }
//        } else {
//            System.out.println("It's not leap year");
//        }


//
                int year = 2400;
                int a = 4;
                int b = 100;
                int c = 400;
                int rest = 0;
                boolean leapYear = true;
                boolean noLeapYear = false;

                System.out.println(year);


                if (year % a > rest) {
                    System.out.println(noLeapYear);
                } else if (year % c == rest) {
                    System.out.println(leapYear);
                } else if (year % b == rest) {
                    System.out.println(noLeapYear);
                } else {
                    System.out.println(leapYear);
                }
            }
        }




//
//        1997 is not a leap year (not divisible by 4)
//        1996 is a leap year (divisible by 4)
//        1600 is a leap year (divisible by 400)
//        1800 is not a leap year (divisible by 4, divisible by 100, NOT divisible by 400)