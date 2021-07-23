public class Class11LoopsSanta {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("FIRST TASK*****************");
        System.out.println(" ");

        System.out.println("--- 1. for loop ---");

        for (int x = -10; x <= 10; x++){
        System.out.println(x);
        }

        System.out.println(" ");
        System.out.println("--- 1. while loop ---");

        int y = -10;
        while(y <= 10){
            System.out.println(y);
            y++;
        }

        System.out.println(" ");
        System.out.println("--- 1. do while loop ---");

        int z = - 10;
        do {
            System.out.println(z);
            z++;
        } while (z <= 10);


        System.out.println(" ");
        System.out.println("SECOND TASK*****************");

        System.out.println(" ");
        System.out.println("--- 2. for loop ---");

        int a = 0;
        for (a = 1; a < 20 - 2; a = a + 2){
                System.out.print(a + ", ");
                }
        System.out.println(a);


        System.out.println(" ");
        System.out.println("--- 2. while loop ---");

        int b = 1;
        System.out.print(b);
        while(b<20){
            b = b + 2;
            if (b>20){
                break;
            }
            System.out.print(", " + b);
        }



//        int count = 0;
//        for (int a = 1; a < 20; a = a + 2){
//            count++;
//        }
//
//        int [] arrayX = new int [count];






    }
}
