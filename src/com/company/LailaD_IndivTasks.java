package com.company;
import java.sql.Array;
import java.util.Arrays;

public class LailaD_IndivTasks {
    public static void main(String[] args) {
        //Task1
        int[] randomNumbers = {3, 11, 81, 20, -4, 0};
        System.out.println("Array in normal order");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }

        System.out.println("Array in reverse order");
        for (int i = randomNumbers.length - 1; i >= 0; i--) {
            System.out.println(randomNumbers[i]);
        }
        //Task2

        int[] anotherArray = {30, 15, 15, 3, 15, 12, 13};
        Arrays.sort(anotherArray);
        System.out.println("The second largest number in the array is " + (anotherArray.length -2));
        System.out.println("The lowest number in the array is " + anotherArray[0]);

    }
}
