public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

//    public void checkPrice() {
//        if (this.price < 900) {
//            System.out.println("This notebook is cheap.");
//        } else {
//            System.out.println("This notebook is quite expensive.");
//        }
//    }

        public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price < 1000 ) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
            }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is not heavy.");
        } else if (this.weight >= 1000 && this.price < 1800 ) {
            System.out.println("The price is quite heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year>=2015 && this.price<800) {
            System.out.println("Notebook is old and cheap.");
        } else if (this.year>=2015 && this.price>=800 ) {
            System.out.println("Notebook is old and expensive.");
        } else if (this.year<2015 && this.price<800 ) {
            System.out.println("Notebook is new and cheap.");
        } else {
            System.out.println("Notebook is new and expensive.");
        }
    }



}