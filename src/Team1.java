public class Team1 {
<<<<<<< HEAD
    public static void main (String[] args) {
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

        float c = a;
        float d = b;
        int sum = a + b;
        System.out.println( a + b);
        System.out.println(sum);




=======
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

        //variables
        short nr1 = 7;
        short nr2 = 100;

        //which variable is the largest
        if (nr1 > nr2) {
            System.out.println("Nr1 is larger than Nr2");
        }
        else {
            System.out.println("Nr2 is larger than Nr1");
        }

        //which variable is the smallest
        if (nr1 < nr2) {
            System.out.println("It is True that Nr1 is smaller than Nr2");
        }
        else {
            System.out.println("It is False that Nr1 is smaller than Nr2"); }

        //if both variables are equals
        if (nr1 == nr2) {
            System.out.println("nr1 is equal nr2");
        }
        else {
            System.out.println("nr1 and nr2 are not equal"); }

        //odd (uneven)
        if  ( nr1 % 2 == 0 ) {
            System.out.println("Nr1 is not odd");
        }
        else
        {
            System.out.println("Nr1 Is odd");}


        if  ( nr2 % 2 == 0 ) {
            System.out.println("Nr2 is not odd");
        }
        else
        {
            System.out.println("Nr2 Is odd");}

        //odd (uneven)
        if  ( nr1 % 2 == 0 ) {
            System.out.println("Nr1 is even");
        }
        else
        {
            System.out.println("Nr1 Is not even");}

        if  ( nr2 % 2 == 0 ) {
            System.out.println("Nr2 is even");
        }
        else
        {
            System.out.println("Nr2 Is not even");}
>>>>>>> origin/master




    }
<<<<<<< HEAD
}


=======
}
>>>>>>> origin/master
