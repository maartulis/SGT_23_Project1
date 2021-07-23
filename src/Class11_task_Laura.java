public class Class11_task_Laura {
    public static void main(String[] args) {
        //Write a program to print numbers from 10 to -10
        //Implement three variations of this exercise: while loop and do while loop.

        //FOR loop:
        for (int i = 10; i >= -10; i--) {
            System.out.println("Value of i : " + i);
        }

        System.out.println("*******************************");

        int x = 10;
        //WHILE loop
        while (x > -10) {
            System.out.println("Value of x : " + x);
            x--;
        }

        System.out.println("_______________________________________");

        //DO While loop
        int y = 10;
        do {
            System.out.println("Value of y : " + y);
            y--;
        } while (y >= -10);


        System.out.println("BONUS task using FOR loop:");
        // BONUS task:

        int z = 1;
        for (z = 1; z + 2 <= 20; z = z + 2) {
            System.out.print(z + ", ");
        }
        System.out.println(z);


        System.out.println("BONUS task using WHILE loop:");

        int t = 1;
        while (t + 2 <= 20) {
            System.out.print(t + ",");
            t = t + 2;
        }
        if (t <= 20) {
            System.out.print(t);
        }

    }
}