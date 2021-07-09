import java.text.DecimalFormat;

public class Team3 {
   /**
     Task 01 - conditions, comparison, basic calculation (45 min)

     Write a program to compare two elements:

     ●      Create two variables with the type short.

     ●      Initialize the variables with the values as You want (no Input from user needed!)

     ●      Verify which variable is the largest. Print out information in the console.

     ●      Verify which variable is the smallest. Print out information in the console.

     ●      Verify if both variables are equals. Print out information in the console.

     ●      Verify if there are any variables which are odd (uneven). Print out information in the console.

     ●      Verify if there are any variables which are even. Print out information in the console.

     ●      Verify if there are any variables which are negative. Print out information in the console.

     ●      Verify if there are any variables which are positive. Print out information in the console.

     ●      Verify if there are any variables which are less than 100. Print out information in the console.


     ●      Calculate sum of two elements, round to whole numbers and print information in the console.

     ●      Calculate differences between both numbers, output it as positive number with two numbers after the coma

     * */


    public static void main(String[] args) {

        short number1, number2;
        number1 = 3;
        number2 = 200;

        if (number1 > number2) {
            System.out.println("First number is the largest.");
        }
        else {
            System.out.println("First number is the smallest.");
        }
        if (number1 > number2) {
            System.out.println("Second number is the smallest.");
        }
        else {
            System.out.println("Second number is the largest.");
        }
        if (number1 == number2) {
            System.out.println("Numbers are equals.");
        }
        else {
            System.out.println("Numbers are not equals.");
        }

        if ((number1 % 2 == 1) || (number2 % 2 == 1)) {
            System.out.println("One of the numbers is odd.");
        }
        else {
            System.out.println("Both of the numbers are odd.");
        }

        if ((number1 % 2 == 0) || (number2 % 2 == 0)) {
            System.out.println("One of the numbers is even.");
        }
        else {
            System.out.println("Both of the numbers are even.");
        }

        if ((number1 < 0) || (number2 < 0)) {
            System.out.println("One of the numbers is negative.");
        }
        else {
            System.out.println("None of the numbers are negative.");
        }

        if ((number1 > 0) && (number2 > 0)) {
            System.out.println("Both of the numbers are positive.");
        }
        else {
            System.out.println("One of the numbers is positive.");
        }

        if ((number1 < 100) || (number2 < 100)) {
            System.out.println("One of the numbers is less than 100.");
        }
        else {
            System.out.println("None of the numbers are less than 100.");
        }

        int sum = number1 + number2;
        System.out.println("The sum of the two numbers is: " + sum);

        double difference = (double)(number1 - number2);
        DecimalFormat format = new DecimalFormat("0.00");
        if (difference < 0) {
            double differenceNegative = (difference * (-1.00));
            System.out.println("The difference of the two numbers is: " + format.format(differenceNegative));
        }
        else {
            System.out.println("The difference of the two numbers is: " + format.format(difference));
        }
        System.out.println("I am the Java program.");


    }




}
