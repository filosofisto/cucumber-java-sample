package com.noumenon;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzStepdefs {

    private FizzBuzz fizzBuzz;
    private String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) {
        result = fizzBuzz.play(number);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String expected) throws Throwable {
        assertEquals(expected, result);
    }
}
