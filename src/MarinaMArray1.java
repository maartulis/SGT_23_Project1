
package com.company;
import java.util.Scanner;

public class MarinaMArray1 {

    public static void main(String[] args) {
        // 1. Create an array with int type which consists of 5 elements

        int [] myArray = new int[5];
        //2. initialize values.

       /*
        myArray[0] =1;
        myArray[1] =2;
        myArray[2] =3;
        myArray[3] =4;
        myArray[4] =5;
        */

        // 7. Change program - initialization of values should be taken from user's input.
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i< myArray.length; i++){
            System.out.println("Please enter an element number " + (i+1));
            myArray[i] = scan.nextInt();
        }
        System.out.println("*********************************");

        //3. Print first, last and some other element from array.
        System.out.println("The first element is: " + myArray[0]);
        System.out.println("The third element is: " + myArray[2]);
        System.out.println("The last element is: " + myArray[4]);

        System.out.println("************************************");
        //  4. Calculate and output sum of all elements in the array.
        int sumArray = 0;
        for (int i = 0; i< myArray.length ; i++){
            sumArray += myArray[i];
        }
        System.out.println("The sum is : " + sumArray);

        System.out.println("****************************************");
        //5. print length of the array.
        System.out.println("The lenghth of array is: " + myArray.length);

        System.out.println("*****************************************");
        //6. Print all five elements using for loop
        for (int i = 0; i< myArray.length ; i++){
            System.out.println("The element numer " + i + " in the array is: " + myArray[i]);
        }
    }
}
