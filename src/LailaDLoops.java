public class LailaDLoops {
    public static void main(String[] args) {

        System.out.println("For loop");

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("======================");

        System.out.println("While loop");

        int i = 10;
        while (i > -11) {
            System.out.println(i);
            i--;
        }
        System.out.println("------------------------------");

        System.out.println("Do while loop");

        int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j > -11);

        System.out.println("++++++++++++++++++++++++++");

        System.out.println("Bonus");
        System.out.println("For loop");

        for ( int x = 1; x <= 20; x = x + 2) {
            System.out.print(x);
            if (x + 2 <= 20) {
                System.out.print(", ");

            }

        }
        System.out.println();
        System.out.println("While loop");

        int y = 1;
        while (y + 2 <= 20) {
            System.out.print(y + ", ");
            y = y + 2;
        } if (y <= 20) {
            System.out.print(y);
        }


    }
}
