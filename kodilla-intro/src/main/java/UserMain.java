public class UserMain {
    public static void main(String[] args) {

        User adam = new User("Adam", 10);
        User basia = new User("Basia", 50);
        User jan = new User("Jan", 30);

        User[] users = {adam, basia, jan};


        int sum = 0;
        for (int i = 0; i < users.length; i++) {

            sum = sum + users[i].age;

        }
        System.out.println(sum);


        int average = sum / users.length;
        System.out.println(average);


        for (int i = 0; i < users.length; i++) {
            if (users[i].age > average) {
                System.out.println(users[i].name);
            } else {
                System.out.println("Age of user is higher than average");
            }

        }
    }
}
