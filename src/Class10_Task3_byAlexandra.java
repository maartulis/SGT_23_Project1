import java.util.Scanner;

public class Class10_Task3_byAlexandra {
    /**
     * 3. Write a program which asks user to input the size of array. Declare and initialize array of
     * whole numbers with such size. Then ask user to input numbers and fill the array.
     * Then use this array to calculate and output the average value of elements in this array.
     * Hint: for learning purposes, use two loops in this exercise (even though it could be implemented with single loop).
     * 1) In first loop just ask the numbers from user and fill the array
     * 2) In second loop calculate the average of elements in array.
     * <p>
     * Example:
     * Please enter count of numbers: 4
     * 1. please enter number: 2
     * 2. please enter number: 4
     * 3. please enter number: 4
     * 4. please enter number: 6
     * Output:
     * Average of 2 4 4 6 is 4
     */
    public static void main(String[] args) {

        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number - size of the array: ");
        int sizeOfArray = scan.nextInt();
        System.out.println("Now enter " + sizeOfArray + " numbers for the array!");

        int[] myArray = new int [sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Please, enter the number: ");
            myArray[i] = scan.nextInt();
        }

        //sum  & average
        int sumOfNumbers = 0;
        for (int i=0; i < sizeOfArray; i++) {
            sumOfNumbers = (sumOfNumbers + myArray[i]);
        }
        double average = (double)sumOfNumbers/(double)sizeOfArray;

        //output
        System.out.print("Average of " );
        for (int i=0; i < sizeOfArray; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.print("is " + average);

    }
}
