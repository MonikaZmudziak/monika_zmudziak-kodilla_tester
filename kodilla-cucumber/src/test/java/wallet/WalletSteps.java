package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private int balance;
    private String answer;


    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
    }


    //test

    @Given("I have deposited $2000 in my wallet")
    public void i_have_deposited_2000_in_my_wallet() {
        wallet.deposit(2000);
        Assert.assertEquals("Incorrect wallet balance", 2000, wallet.getBalance());
    }

    @When("I request $3000")
    public void i_request_$3000() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 3000);
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void $3000_should_be_dispensed() {
        Assert.assertEquals(3000, cashSlot.getContents());
    }

    //test

    @Given("there is $1000 in my wallet")
    public void $1000_should_be_in_wallet() {
        wallet.deposit(1000);
    }

    @When("I check the balance of my wallet")
    public void i_check_balance_of_my_wallet() {
        this.balance = wallet.getBalance();
        Assert.assertEquals("Incorrect wallet balance", 1000, wallet.getBalance());
    }

    @Then("I should see that the balance is $1000")
    public void $1000_should_be_view_in_wallet() {
        this.answer = wallet.displayBalance();
        Assert.assertEquals("the balance of yor wallet is: " + this.balance, this.answer);
    }

    //display balance
    @Given("there is $100 in my wallet")
    public void $100_should_be_in_wallet() {
        wallet.deposit(100);
    }

    @When("I check the balance of my wallet:")
    public void i_check_balance() {
        this.balance = wallet.getBalance();
        Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
    }

    @Then("I should see that the balance is $100!")
    public void $100_should_be_view_in_wallet() {
        this.answer = wallet.displayBalance();
        Assert.assertEquals("the balance of yor wallet is: " + this.balance, this.answer);

    }

    @Given("there is $100 in my wallet test")
    public void i_have_deposited_100_in_my_wallet() {
        wallet.deposit(100);
        Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
    }

    @When("I withdraw $200 test")
    public void i_request_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed test")
    public void nothing_should_be_dispensed_test() {
        Assert.assertEquals(200, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet test")
    public void do_not_have_enough_money() {
        Assert.assertEquals(200, cashSlot.getContents());
    }
}