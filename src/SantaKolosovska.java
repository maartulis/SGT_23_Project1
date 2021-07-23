public class SantaKolosovska {
    public static void main(String[] args) {
        // initializing an array
        int[] myArray = {1, 6, 3, 50, 3, 12};

        // printing out all the numbers of array
        System.out.print("All the numbers of array: ");
        System.out.println(" ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //printing out all the numbers of array in reverse order
        System.out.print("All the numbers of array in reverse order: ");
        System.out.println(" ");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        /**Task2 - Define an array with seven whole numbers (30, 15, 15, 3, 15, 12, 13). Write a program that finds
         second highest number in array and the lowest number in array. Output those numbers.*/

        int[] myArray2 = {30, 15, 15, 3, 15, 12, 13};

        // finding the smallest number
        int a = myArray2[0];
        for (int i = 0; i < myArray2.length; i++){
            if (myArray2[i] < a) {
                a = myArray2[i];
            }
        }
        System.out.println("Smallest number in the array is " + a);

        // finding the largest number
        int b = myArray2[0];
        for (int i = 0; i < myArray2.length; i++){
            if (myArray2[i] > b){
                b = myArray2[i];
            }
        }

        // finding the second largest number
        int c = a;
        for (int i = 0; i < myArray2.length; i++){
            if ((myArray2[i] < b) && myArray2[i]>c){
                c = myArray2[i];
            }
        }
        System.out.println("The second largest number in the array is " + c);

    }
}
