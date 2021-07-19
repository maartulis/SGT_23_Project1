public class LienePodniece {
    public static void main(String[] args) {

        //1. declare and initialize array with six arbitrary whole numbers. Write a code which:
        //         1) prints out all of the numbers from array
        //         2) prints out all of the numbers from array in reverse order

    int[] myNumber = new int [6];
    myNumber[0] = 5;
    myNumber[1] = 10;
    myNumber[2] = 3;
    myNumber[3] = 7;
    myNumber[4] = 25;
    myNumber[5] = 17;

    for (int i = 0; i < 7; i++)
        System.out.println(myNumber[i]);

    System.out.println("************");

    for (int i = myNumber.length-1; i >= 0; i--)
            System.out.println(myNumber[i]);

    System.out.println("************");

        //2. Define an array with seven whole numbers (30, 15, 15, 3, 15, 12, 13).
        // Write a program that finds second highest
        // number in array and the lowest number in array. Output those numbers.

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
