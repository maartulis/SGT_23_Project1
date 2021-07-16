package com.company;
import java.util.Scanner;

public class Array1stTaskLaura {
    public static void main(String[] args) {
        // Create an array with int type which consists of 5 elements

        int[] myElements = new int [5];

        //Initialize the array elements by users input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first element : ");
        myElements [0] = scan.nextInt();
        System.out.println("Enter the second element : ");
        myElements [1] = scan.nextInt();
        System.out.println("Enter the third element : ");
        myElements [2] = scan.nextInt();
        System.out.println("Enter the fourth element : ");
        myElements [3] = scan.nextInt();
        System.out.println("Enter the fifth element  ");
        myElements [4] = scan.nextInt();

        scan.close();


        //int[] myElements = { 3, 24, 33, 1, 18, 239};

        // Print first, last and some other element from array.

        System.out.println(myElements[0]);
        System.out.println(myElements[4]);
        System.out.println(myElements[3]);

        System.out.println("------------------");
        // Calculate and output sum of all elements in the array.

        int sum = 0;
        for (int i = 0; i < myElements.length; i++) {
            sum = sum + myElements[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);

        System.out.println("------------------");

        // print length of the array
        System.out.println("Length of my list is: " + myElements.length);

        System.out.println("------------------");

        // Print all five elements using for loop

        for (int i = 0; i < myElements.length; i++){
            System.out.println(myElements[i]);
        }

        System.out.println("------------------");

        // Change program - initialization of values should be taken from user's input

    }

}
