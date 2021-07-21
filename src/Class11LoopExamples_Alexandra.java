public class Class11LoopExamples_Alexandra {
    public static void main(String[] args) {
//Task 1

        int x = 10;

        //WHILE
        System.out.println("***WHILE LOOP***");
        while (x >= (-10)) {
            System.out.println("Value of x number is " + x);
            x--;
        }

        //WHILE DO
        x = 10;
        System.out.println("*** DO WHILE LOOP***");
        do {
            System.out.println("Value of x number is " + x);
            x--;
        } while (x >= (-10));

        //FOR
        System.out.println("*** FOR ***");
        for (int i = 10; i >= (-10); i--) {
            System.out.println("Value of i number is " + i);
        }

//Task 2
        System.out.println("*** TASK 2 - FOR LOOP ***");
        for (int i = 1; i <= 20; i = i + 2) {
            if(i == 19) {
                System.out.print(i);
                break;
            }
                System.out.print(i + " ,");
        }
    }
}
