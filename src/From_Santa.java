import java.util.Scanner;

public class From_Santa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//
//
//     Practical part 1 (individual, 30-60 min):
//
//     1. Create an array with int type which consists of 5 elements

        int[] elementsArray = new int[5];

        System.out.println("Please write five numbers: ");
        elementsArray[0] = scanner.nextInt();
        elementsArray[1] = scanner.nextInt();
        elementsArray[2] = scanner.nextInt();
        elementsArray[3] = scanner.nextInt();
        elementsArray[4] = scanner.nextInt();
//
//     2. initialize values.

//        elementsArray[0] = 3;
//        elementsArray[1] = 6;
//        elementsArray[2] = 1;
//        elementsArray[3] = 9;
//        elementsArray[4] = 2;

//
//     3. Print first, last and some other element from array.

        System.out.println("First element is " + elementsArray[0] + ", last element is " + elementsArray[4] + ", fourth element is " + elementsArray[3]);
//
//     4. Calculate and output sum of all elements in the array.

        System.out.println("The sum of all elements is " + (elementsArray[0] + elementsArray[1] + elementsArray[2] + elementsArray[3] + elementsArray[4]));

//
//     5. print length of the array.

        System.out.println("The length of the array is " + elementsArray.length);
//
//     6. Print all five elements using for loop


        System.out.print("All elements of the array are: ");
        System.out.println(" ");

        for (int i = 0; i < elementsArray.length; i++) {
            System.out.println(elementsArray[i]);
        }
    }
}