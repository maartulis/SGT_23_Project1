import java.util.Scanner;
public class Santa_Anna_BAlina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//     ●      Create two numerical variables with initial values.

//        int x = 5;
//        int y = 3;


        System.out.println("Please write two numbers: ");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println("Please write the option +, -, /, *, %, p (print out), b (which one is bigger), s (which one is smaller: ");

        String str = scanner.next();
        char op = str.charAt(0);


//     ●      Create an char type variable which represents the user option (please use the switch control):


//        char op = '+';
//        char op = '-';
//        char op = '/';
//        char op = '*';
//        char op = '%';
//        char op = 'p';
//        char op = 'b';
//        char op = 's';




        switch (op) {

            case '+':                   //     a.      ‘+’ sum both elements;
                System.out.println(x + y);
                break;


            case '-':                   //     b.     ’-’: do subtraction;{

                System.out.println(x - y);
                break;


            case '/':                   //     c.      ’/’: do dividing;
                System.out.println(x / y);
                break;


            case '*':                   //     d.     ‘*’: do multiplication;
                System.out.println(x * y);
                break;


            case '%':                   //     e.      ‘%’: get remainder when the first element is divided by the second element;
                System.out.println(x % y);
                break;


            case 'p':                   //     f.      ‘p’: print out both elements;
                System.out.println(x + " and " + y);
                break;


            case 'b':                   //     g.     ‘b’: verify which element is bigger;
                if (x > y) {
                    System.out.println(x + " is the biggest value");
                } else {
                    System.out.println(y + " is the biggest value");
                }
                break;


            case 's':                   //     h.     ‘s’:verify which element is smaller;
                if (x > y) {
                    System.out.println(y + " is the smallest value");
                } else {
                    System.out.println(x + " is the smallest value");
                }
                break;


        }


    }
}
