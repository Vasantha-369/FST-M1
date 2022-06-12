package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numberarray = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numberarray));
        
        //Set constants
        int findNum = 10;
        int sumValue = 30;

        //Print result
        System.out.println("Result: " + result(numberarray, findNum, sumValue));
    }

    public static boolean result(int[] numbers, int findNum, int sumValue) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == findNum) {
                //Add them
                temp_sum += findNum;
            }

            //Sum should not be more than 30
            if (temp_sum > sumValue) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == sumValue;
    }
}