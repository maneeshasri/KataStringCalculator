package src.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.main.StringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {

    @Test
    public void calculateEmptyResult() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void calculateSingleNumber() {
        Assert.assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void calculateTwo_expectTwo() {
        Assert.assertEquals(2, StringCalculator.add("2"));
    }

    @Test
    public void calculateTwoToOne_expectThree() {
        Assert.assertEquals(3, StringCalculator.add("2,1"));
    }

    @Test
    public void calculateTwoToOneWithNewlines_expectThree() {
        Assert.assertEquals(6, StringCalculator.add("1\n2,3"));
    }


    @Test
    public void calculateSingleNegativeValue_exception() {
        try {
            StringCalculator.add("-1");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed (-1)", e.getMessage());
        }
    }

    @Test
    public void calculateTwoNegativeValue_exception() {
        try {
            StringCalculator.add("-1,-2");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed (-1,-2)", e.getMessage());
        }
    }

    @Test
    public void calculateTwoToOneThousandOne_Two() {
        Assert.assertEquals(2, StringCalculator.add("2,1001"));
    }
}