package com.helen;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;

public class Steps {
    ActionWords actionWords = new ActionWords();
    @Given("have number {int}")
    public void have_number(Integer int1) {
        actionWords.firstNumber(int1);
    }
    @When("add {int}")
    public void add(Integer int1) {
        actionWords.addSecondNumber(int1);
    }
    @Then("result {int}")
    public void result(Integer int1) {
        actionWords.verifyResult(int1);
    }

    @Given("any number is {int}")
    public void any_number_is(Integer int1) {
        actionWords.firstNumber(int1);
    }
    @When("another number {int}")
    public void another_number(Integer int1) {
        actionWords.addSecondNumber(int1);
    }
    @Then("result is {int}")
    public void result_is(Integer int1) {
        actionWords.verifyResult(int1);
    }
}
