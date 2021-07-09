public class Teamx {

    public static void main(String[] args) {
        // Create two variables with the type short.
        // Initialize the variables with the values as You want (no Input from user needed!)
        short a = 20;
        short b = 13;
        if (a < b) {
            System.out.println("b is bigger than a");
        } else {
            System.out.println("a is bigger than b");
        }

        if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("b is smeller than a");
        }

        if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println(" a is not equals with b");
        }

        if ((!(a % 2 == 0)) || (!(b % 2 == 0))) {
            System.out.println("a or b is odd number");
        } else {
            System.out.println("a or b is not odd number");
        }

        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.println("a or b is even number");
        } else {
            System.out.println("a or b is not even number");
        }
        if ((a < 0) || (b < 0)) {
            System.out.println("a or b is negative number");
        } else {
            System.out.println("a or b is positive number");
        }
        if ((a > 0) || (b > 0)) {
            System.out.println("a or b is positive number");
        } else {
            System.out.println("a or b is negative number");
        }
        if ((a < 100) || (b < 100)) {
            System.out.println("a or b is less than 100");
        } else {
            System.out.println("a or b is bigger than 100");
        }

        int sum = a + b;
        System.out.println(sum);

    }
}
