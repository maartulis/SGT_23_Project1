public class Class11LoopsSanta {
    public static void main(String[] args) {

        System.out.println("FIRST TASK*****************");
        System.out.println("--- 1. for loop ---");

        for (int x = -10; x <= 10; x++){
        System.out.println(x);
        }

        System.out.println("--- 1. while loop ---");

        int y = -10;
        while(y <= 10){
            System.out.println(y);
            y++;
        }

        System.out.println("--- 1. do while loop ---");

        int z = - 10;
        do {
            System.out.println(z);
            z++;
        } while (z <= 10);


        System.out.println("SECOND TASK*****************");


        for (int a = 1; a < 20; a = a + 2){
            System.out.print(a + ", ");
        }

        System.out.println("--- 2. count ---");


        int count = 0;
        for (int a = 1; a < 20; a = a + 2){
            count++;
        }
        System.out.println(count);
        int [] arrayX = new int [count];

        for (int a = 1; a < 20; a = a + 2){
            arrayX[a-2] = a++;
        }

        System.out.println("arrayX size is " + arrayX.length);
        System.out.println(arrayX[1]);




//        int x;
//        int aa = 1;
//        for (aa; aa <= 20; aa = aa + 2){
//            aa
//
//        }

        System.out.println(" ");
        System.out.println("--- 2. while loop ---");

        int b = 1;
        while(b<20){
            System.out.print(b + ", ");
            b = b + 2;
        }
        System.out.println(); //sout






    }
}
