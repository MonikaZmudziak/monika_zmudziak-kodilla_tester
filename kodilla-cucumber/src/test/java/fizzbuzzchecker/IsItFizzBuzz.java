package fizzbuzzchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class IsItFizzBuzz {

    private int number;
    private String result;

    @Given("Number is {int}")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @When("I ask if it's FizzBuzz")
    public void checkFizzBuzz() {
        FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
        this.result = fizzBuzzChecker.itIsFizzBuzz(this.number);
    }

    @Then("I should be told you: {string}")
    public void verifyResult(String expected) {
        Assertions.assertEquals(expected, this.result);
    }
}
