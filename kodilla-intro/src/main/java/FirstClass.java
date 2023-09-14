public class FirstClass {
    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1000, 2022);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500,2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        Notebook exampleNotebook = new Notebook(3200, 800, 2005);
        System.out.println(exampleNotebook.weight + " " + exampleNotebook.price);
        exampleNotebook.checkPrice();
        exampleNotebook.checkWeight();
        exampleNotebook.checkYearAndPrice();

        Notebook example2Notebook = new Notebook(900, 1200, 2003);
        System.out.println(example2Notebook.weight + " " + example2Notebook.price);
        example2Notebook.checkPrice();
        example2Notebook.checkWeight();
        example2Notebook.checkYearAndPrice();

        Notebook example3Notebook = new Notebook(1000, 1000, 1999);
        System.out.println(example3Notebook.weight + " " + example3Notebook.price);
        example3Notebook.checkPrice();
        example3Notebook.checkWeight();
        example3Notebook.checkYearAndPrice();


//        if (notebook.price < 900) {
//            System.out.println("This notebook is cheap");
//        } else {
//            System.out.println("This notebook is quite expensive");
//        }
    }
}
