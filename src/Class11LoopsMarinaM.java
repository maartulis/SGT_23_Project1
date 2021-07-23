public class Class11LoopsMarinaM {
    public static void main(String[] args) {

        System.out.println("FOR: ");

        for (int i = 10 ; i >= -10 ; i--){
            System.out.print (i + " ");
        }

        System.out.println();
        System.out.println("-----------------");
        System.out.println("WHILE: ");

        int i = 10;
        while (i>=-10){
            System.out.print(i +" ");
            i--;
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println("DO WHILE: ");

        i = 10;
        do{
            System.out.print(i + " ");
            i--;
        } while (i >= -10);
        System.out.println();
        System.out.println("-----------------");
        System.out.println("*****************");

        //bonus
        System.out.println("WHILE: every second number: 1...20: ");
        i = 1;
        while (i <= 20-2){
            System.out.print(i +" ,");
            i+=2;
        }
        System.out.print(i);


        System.out.println();
        System.out.println("FOR: every second number: 1...20: ");
        int j = 0;
        for (j = 1; j <= 20-2 ; j+=2) {
            System.out.print(j +" ,");
        }
        System.out.println(j);
    }
}
