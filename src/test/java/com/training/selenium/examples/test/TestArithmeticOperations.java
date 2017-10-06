package com.training.selenium.examples.test;
import com.training.selenium.examples.ArithmeticOperations;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Shenbaga on 28-09-2017.
 */
public class TestArithmeticOperations {
    ArithmeticOperations object;

    @Before
    public void setUp(){
        object = new ArithmeticOperations();
    }


    @Test
    public void testAddition(){
        int actualResult = object.addition(1,2);
        System.out.println("Test Addition- Actual result " + actualResult);
        Assert.assertEquals("Value should be equal",3,actualResult);
    }

    @Test
    public void testMultiplication(){
        int actualResult = object.multiplication(2, 2);
        System.out.println("Test Multiplication - Actual result " + actualResult);
        Assert.assertEquals(4,actualResult);
    }

    @Test
    public void testBubbleSort(){
        int[] input = {14, 48, 27, 35 ,8}; //8 14 27 35 48
        int[] expectedoutput = {8, 14, 27, 35, 48};
        int[] actualoutput = object.bubbleSort(input);
        Assert.assertEquals("two arrays should be equal", Arrays.toString(expectedoutput),Arrays.toString(actualoutput));
    }
}
