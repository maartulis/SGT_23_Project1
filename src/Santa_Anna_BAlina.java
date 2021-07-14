import java.util.Scanner;
public class Santa_Anna_BAlina {
    Scanner scanner = new Scanner(System.in);

//    *
//     Write a program to do multiple calculation options with two numbers:
//
//     ●      Create two numerical variables with initial values.

//        int x = 5;
//        int y = 3;



       System.out.println("Please write two numbers: ")
     int x = scanner.nextInt();
     int y = scanner.nextInt();
        System.out.println("Please write the option +, -, /, *, %, p (print out), b (which one is bigger), s (which one is smaller: ")
        char myLetter = scanner.charAt(0);
//
//
//     ●      Create an char type variable which represents the user option (please use the switch control):


            char myLetter = '+';
            char myLetter = '-';
            char myLetter = '/';
            char myLetter = '*';
            char myLetter = '%';
            char myLetter = 'p';
            char myLetter = 'b';
            char myLetter = 's';


//     a.      ‘+’ sum both elements;

                switch (myLetter) {
                case '+':
                System.out.println(x+y);
                }
                break;
//
//     b.     ’-’: do subtraction;{

                case '-':
                System.out.println(x-y);
                break;
//
//     c.      ’/’: do dividing;

                case '/':
                System.out.println(x/y);
                break;

//
//     d.     ‘*’: do multiplication;


                case '*':
                System.out.println(x*y);
                break;
//
//     e.      ‘%’: get remainder when the first element is divided by the second element;


                case '%':
                System.out.println(x%y);
                break;
//
//     f.      ‘p’: print out both elements;


                case 'p':
                System.out.println(x + "and" + y);
                break;
//
//     g.     ‘b’: verify which element is bigger;


                case 'b':
                if (x>y) {
                System.out.println(x + " is the biggest value");
                } else {
                System.out.println(y + " is the biggest value");
                }
//
//     h.     ‘s’:verify which element is smaller;

                    case 's':
                    if (x>y) {
                        System.out.println(y + " is the smallet value");
                    } else {
                        System.out.println(x + " is the smallet value");
                    }


    }


//
//     ●      * additionally - please do add the possibility to write both variable values and the option in the console. Read, verify and do an algorithm
//
//     ●
//     *
}
