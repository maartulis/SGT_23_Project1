public class Array2ndTask_fromAlexandra {
    public static void main(String[] args) {
        /**Task1 - Declare and initialize array with six arbitrary whole numbers. Write a code which:
         1) prints out all of the numbers from array;
         2) prints out all of the numbers from array in reverse order. */
        int [] myArray = {10,6,28,14,7,33};
        for (int i=0; i<6; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println("*********");

        for (int i=myArray.length-1; i>=0; i--) {
            System.out.println(myArray[i]);
        }

        System.out.println("*********");

        /**Task2 - Define an array with seven whole numbers (30, 15, 15, 3, 15, 12, 13). Write a program that finds
         second highest number in array and the lowest number in array. Output those numbers.*/
        int [] myArray2 = {30, 15, 15, 3, 15, 12, 13};
        int lowestNum = myArray2[0]; //starts with the first value
        for (int i=0; i<myArray2.length; i++) {
            if (myArray2[i] < lowestNum) {
                lowestNum = myArray2[i];
            }
        }
        System.out.println("The lowest number is " + lowestNum);

        System.out.println("*********");

        int maxNum = myArray2[0]; //starts with the first value
        for (int i=0; i<myArray2.length; i++) {
            if (myArray2[i] > maxNum) {
                maxNum = myArray2[i];
            }
        }
        System.out.println("The second highest number is " + maxNum);

    }
    }
