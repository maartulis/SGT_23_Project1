import java.util.Scanner;

public class Array1stTask_fromAlexandra {

    public static void main(String[] args) {
        // create an array
        int[] newArray = new int [5];

        //Initialize the array elements by users input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st element of your array: ");
        newArray [0] = scan.nextInt();
        System.out.println("Enter the 2nd element of your array: ");
        newArray [1] = scan.nextInt();
        System.out.println("Enter the 3d element of your array: ");
        newArray [2] = scan.nextInt();
        System.out.println("Enter the 4th element of your array: ");
        newArray [3] = scan.nextInt();
        System.out.println("Enter the 5th element of your array: ");
        newArray [4] = scan.nextInt();

        scan.close();

        /**initialize values
         newArray [0] = 6;
         newArray [1] = 10;
         newArray [2] = 22;
         newArray [3] = 35;
         newArray [4] = 48; */

        //first, last and some other element from array
        System.out.println("The first element in the array is " + newArray[0]);
        System.out.println("The last element in the array is " + newArray[4]);
        System.out.println("The second element in the array is " + newArray[1]);

        System.out.println("*************");

        //Calculate and output sum of all elements in the array
        int sumofArrayElements = (newArray [0] + newArray [1] + newArray [2] + newArray [3] + newArray [4]);
        System.out.println("The sum of all elements in the array is " + sumofArrayElements);

        System.out.println("*************");

        //Print length of the array
        System.out.println("The length of the array is " + newArray.length);

        System.out.println("*************");

        //Print all five elements using for loop
        System.out.println("Let's see all elements from the array:");

        for (int i=0; i<5; i++) {
            System.out.println(newArray[i]);
        }
    }
}
