public class Team2 {
    public static void main(String[] args) {
        short number1 = 37;
        short number2 = 23;
        if (number1 > number2) {
            System.out.println(number1 + " is bigger");
            System.out.println(number2 + " is smaller");
        } else {
            System.out.println(number2 + " is bigger");
            System.out.println(number1 + " is smaller");
        }

        if (number1 == number2) {
            System.out.println("numbers are equal");
        }

        if((number1 % 2) ==1) {
            System.out.println(number1 + " is odd ");
        } else {
            System.out.println(number1 + " is even ");
        }

        if((number2 % 2) ==1) {
            System.out.println(number2 + " is odd ");
        } else {
            System.out.println(number2 + " is even ");
        }
    }
}