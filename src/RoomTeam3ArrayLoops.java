import java.util.Scanner;

/**
 * 3. Write a program which asks user to input the size of array. Declare and initialize array of
 * whole numbers with such size. Then ask user to input numbers and fill the array.
 * Then use this array to calculate and output the average value of elements in this array.
 * Hint: for learning purposes, use two loops in this exercise (even though it could be implemented with single loop).
 * 1) In first loop just ask the numbers from user and fill the array
 * 2) In second loop calculate the average of elements in array.
 * Example:
 * Please enter count of numbers: 4
 * 1. please enter number: 2
 * 2. please enter number: 4
 * 3. please enter number: 4
 * 4. please enter number: 6
 * Output:
 * Average of 2 4 4 6 is 4
 */
public class RoomTeam3ArrayLoops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter number: ");
            array[i] = s.nextInt();
        }
        //for (int i = 0; i < size; i++) {
            //System.out.println(array[i]);
        //}
        System.out.println("Output:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        float average = (float) sum/size;
        System.out.println("The average is " + average);
    }
}