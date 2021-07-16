package com.company;
import java.util.Scanner;

public class Room2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scan.nextInt();
        System.out.println("Enter second number: ");
        int y = scan.nextInt();
        System.out.println("Enter an operator: ");
        String str = scan.next();
        char option =  str.charAt(0);

        scan.close();
        /*
        int x = 4;
        int y = 8;

        char a = '+';
        char b = '-';
        char c = '/';
        char d = '*';
        char e = '%';
        char f = 'p';
        char g = 'b';
        char h = 's';
        char option = '+';

         */

        switch (option) {
            case '+':
                System.out.println("The sum is " + (x + y));
                break;
            case '-':
                System.out.println("The sum is " + (x - y));
                break;
            case '/':
                System.out.println("The sum is " + (x / y));
                break;
            case '*':
                System.out.println("The sum is " + (x * y));
                break;
            case '%':
                System.out.println("The sum is " + (x % y));
                break;
            case 'p':
                System.out.println("Entered numbers are " + x + " " + y);
                break;
            case 'b':
                if (x > y) {
                    System.out.println(x + " is bigger than " + y);
                } else {
                    System.out.println(y + " is bigger than " + x);
                }
                break;
            case 's':
                if (x < y) {
                    System.out.println("x is smaller than y");
                } else {
                    System.out.println("y is smaller than x");
                    break;
                }
            default:
                System.out.println("Incorrect input, please check your data!");

        }
    }
}




