package com.helen;

import org.junit.Assert;

public class ActionWords {
    private int number1, number2, actualResult, expectedResult;

    public void firstNumber(Integer actionNumber1){
        number1 = actionNumber1;
    }

    public void addSecondNumber(Integer actionNumber2){
        number2 = actionNumber2;
        actualResult = number1 + number2;
    }

    public void verifyResult (Integer actionResult){
        expectedResult = actionResult;
        Assert.assertTrue(actionResult == expectedResult);
    }
}
