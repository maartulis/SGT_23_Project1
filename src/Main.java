package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] Array = new int [5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first element :");
        Array [0] = scan.nextInt();
        System.out.println("Please enter second element :");
        Array [1] = scan.nextInt();
        System.out.println("Please enter third element :");
        Array [2] = scan.nextInt();
        System.out.println("Please enter fourth element :");
        Array [3] = scan.nextInt();
        System.out.println("Please enter fifth element :");
        Array [4] = scan.nextInt();

        scan.close();
        
        int sumArray = (Array[0]+Array[1]+Array[2]+Array[3]+Array[4]);
        System.out.println("First element from array " +Array[0]);
        System.out.println("Last element from array " +Array[4]);
        System.out.println("Fourth element from array " +Array[3]);
        System.out.println("Sum of all elements " +sumArray);
        System.out.println("Length of Array "+Array.length);

        System.out.println("***********************");
        for(int i = 0; i<5; i++) {
            System.out.println(Array[i]);
        }
    }
}
 /*
         Practical part 1 (individual, 30-60 min):
         1. Create an array with int type which consists of 5 elements
         2. initialize values.
         3. Print first, last and some other element from array.
         4. Calculate and output sum of all elements in the array.
         5. print length of the array.
         6. Print all five elements using for loop
         <bonus>
         7. Change program - initialization of values should be taken from user's input.
         P.S. Example of for loop:
         //outputting all values in array with loop
         int[] myList3 = {110, 55, 50};
         System.out.println(myList3[0]);
         System.out.println(myList3[1]);
         System.out.println(myList3[2]);
         System.out.println(" *********** ");
         for (int i = 0; i < 3; i++) {
         System.out.println(myList3[i]);
         }*/
