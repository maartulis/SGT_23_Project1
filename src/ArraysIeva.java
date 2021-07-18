import java.util.Scanner;
import java.util.Arrays;

public class ArraysIeva {

    public static void main(String[] args) {


/*        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] array = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            array[i] = s.nextInt();
        }*/

        int[] array = new int[5];
        Scanner scan4 = new Scanner(System.in);
        System.out.println("To create an array, please write 5 numbers:");
        for (int i = 0; i < 5; i++) {
            array[i] = scan4.nextInt();
        }

        System.out.println("The first element from array is " + array[0]);
        System.out.println("The last element from array is " + array[4]);
        System.out.println("The third element from array is " + array[2]);

        System.out.println("The sum of all elements in the array is: " +
                (array[0] + array[1] + array[2] + array[3] + array[4]));
        System.out.println("The length of array is: " + (array.length));

        System.out.println("***********************");
        System.out.println("All the elements in the array: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(+ array[i]);
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

    }
}
