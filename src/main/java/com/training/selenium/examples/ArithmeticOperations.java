package com.training.selenium.examples;

import java.util.Arrays;

/**
 * Created by Shenbaga on 28-09-2017.
 */
public class ArithmeticOperations {
    //Functionality 1
    public int addition(int operand1, int operand2){
        return operand1 + operand2;
    }

    //Functionality 2
    public int multiplication(int operand1, int operand2){
        return  operand1 * operand2;
    }

    public int[] bubbleSort(int[] input) throws RuntimeException{
        System.out.println("\nFor Loop Demo\n");

        System.out.println("Bubble Sorting Technique\n");
        /*
        Bubble Sorting Technique :

         Starting on the left, compare adjacent items and keep “bubbling” the larger ones to the right

         */

        System.out.println("Before Sorting: " + Arrays.toString(input));

        for(int interation = 1 ; interation <= 5 ; interation++){
            for(int i = 0,j = 1 ; i < 5 && j < 5 ;i++, j++){
                if(input[i] < input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            System.out.println("Sort No : " + interation + ", Result: " + Arrays.toString(input));
        }

        System.out.println("After Sorting: " + Arrays.toString(input));
        return input;
    }
}
