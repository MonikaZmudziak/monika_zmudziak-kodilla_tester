package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public String displayBalance() {
        String display = "the balance of yor wallet is: " + balance;
        System.out.println(display);
        return display;
    }
}