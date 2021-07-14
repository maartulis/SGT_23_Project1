import java.util.Scanner;

public class Calculator_Team4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter an operator: ");
        String str = scan.next();
        char sign =  str.charAt(0);

        scan.close();

        //int num1 = 15;
        //int num2 = 10;
        //char sign = 'D';

        switch (sign) {
            case '+':
                System.out.println("The sum is " + (num1 + num2));
                break;
            case '-':
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case '/':
                float result = ((float)num1/num2);
                System.out.println(result);
                break;
            case '*':
                System.out.println("The multiplication is " + (num1*num2));
                break;
            case '%':
                System.out.println("The remainder is " + (num1%num2));
                break;
            case 'p':
                System.out.println("Entered numbers are " + num1 + " " + num2);
                break;
            case 'b':
                if (num1>num2) {
                    System.out.println("num1 is bigger than num2");} else if (!(num1==num2)){
                    System.out.println("num2 is bigger than num1");
                }
                break;
            case 's':
                if (num1<num2) {
                    System.out.println("num1 is smaller than num2");} else if (!(num1==num2)){
                    System.out.println("num2 is smaller than num1");
                }
                break;
            default:
                System.out.println("Sign is not allowed!");
        }
    }
}