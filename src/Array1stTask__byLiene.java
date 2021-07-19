import java.util.Scanner;

public class Array1stTask__byLiene{

        public static void main(String[] args) {

            //1. Create an array with int type which consists of 5 elements
            //2. initialize values.
            Scanner scan = new Scanner(System.in);
            int num0 = scan.nextInt();
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = scan.nextInt();
            int num4 = scan.nextInt();

            System.out.println("**********");

            //3. Print first, last and some other element from array.
            System.out.println(num0);
            System.out.println(num4);
            System.out.println(num2);

            System.out.println("**********");

            //4. Calculate and output sum of all elements in the array.
            System.out.println(num0 + num1 + num2 + num3 + num4);

            System.out.println("**********");

            // 5. print length of the array.
            int[] myArray = new int[5];
            System.out.println(myArray.length);

            System.out.println("******0****");

            //6. Print all five elements using for loop
            int[] myList3 = {num0, num1, num2, num3, num4};
            System.out.println(num0);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);

            System.out.println(" *********** ");
            for (int i = 0; i < 5; i++) {
                System.out.println(myList3[i]);
            }

            //<bonus>
            //     7. Change program - initialization of values should be taken from user's input.
        }
    }
    /**

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
     }
     */



