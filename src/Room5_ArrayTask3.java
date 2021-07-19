import java.util.Scanner;
public class Room5_ArrayTask3 {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Your array is:");
                System.out.println("Enter number 1: ");
                int number1 = scan.nextInt();
                System.out.println("Enter number 2: ");
                int number2 = scan.nextInt();
                System.out.println("Enter number 3: ");
                int number3 = scan.nextInt();
                System.out.println("Enter number 4: ");
                int number4 = scan.nextInt();

                int[] myList = {number1, number2, number3, number4};

                int sum = (number1+number2+number3+number4);
                double average = sum / myList.length;
                System.out.println("Average value of the array elements is : " + average);
                        }
                }

