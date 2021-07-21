import java.util.Arrays;

public class LailaDArrays {
    public static void main(String[] args) {
        //Task1
        int[] randomNumbers = {3, 11, 81, 20, -4, 0};
        System.out.println("Array in normal order");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }

        System.out.println("Array in reverse order");
        for (int i = randomNumbers.length - 1; i >= 0; i--) {
            System.out.println(randomNumbers[i]);
        }

        //Task2
        System.out.println("-------------------------------------");
        int[] anotherArray = {30, 15, 15, 3, 15, 12, 13};
        Arrays.sort(anotherArray);
        int maxVal = anotherArray[anotherArray.length - 1];
        int secondMaxVal = anotherArray[0];
        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] > secondMaxVal && anotherArray[i] < maxVal) {
                secondMaxVal = anotherArray[i];
            }
        }

        System.out.println("The second largest number in the array is " + secondMaxVal);
        System.out.println("The lowest number in the array is " + anotherArray[0]);

    }
}

