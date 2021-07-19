package com.company;
import java.util.Scanner;

public class PrintArrMarinaM {

    public static void main(String[] args) {
        //Class 10 individual tasks:
        /**
         30 minutes (once doen, please do rise hand in MS Teams)
         1. declare and initialize array with six arbitrary whole numbers. Write a code which:
         1) prints out all of the numbers from array
         2) prints out all of the numbers from array in reverse order
         2. Define an array with seven whole numbers (30, 15, 15, 3, 15, 12, 13). Write a program that finds second highest
         number in array and the lowest number in array. Output those numbers.
         * */
/*
        //declare and initialize array with six arbitrary whole numbers.
        int [] myArray = new int[6];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i< myArray.length; i++){
            System.out.println("Please enter an element number " + (i+1));
            myArray[i] = scan.nextInt();
        }
        //prints out all of the numbers from array
        for (int i = 0; i< myArray.length ; i++){
            System.out.println("The element number " + (i + 1) + " in the array is: " + myArray[i]);
        }
        System.out.println("********************************");
        //prints out all of the numbers from array in reverse order
        for (int i = myArray.length - 1; i>=0 ; i--){
            System.out.println("The element number " + (i + 1) + " in the array is: " + myArray[i]);
        } */
        System.out.println("----------------------------------" );
        int [] my2Array = {30, 15, 15, 3, 15, 12, 13};
        int min = my2Array[0];
        //int another_max = my2Array[0];
        int max = my2Array[0];
        for (int i = 0; i < 6; i++) {
            if (my2Array[i] <= min){
                min = my2Array[i];
            }

            if (my2Array[i] > max){
                max = my2Array[i];
            }
        }
        int another_max = min;
        for (int i = 0; i < 6; i++) {
            if (my2Array[i] > another_max && my2Array[i] < max){
                another_max = my2Array[i];
            }
        }

        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);
        System.out.println("The second highest number is: " + another_max);

    }
}
