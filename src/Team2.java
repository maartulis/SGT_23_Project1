public class Team2 {
    public static void main(String[] args) {
        short number1 = 137;
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

        if(number1 < 0)
        {
            System.out.println(number1 + " is negative ");
        } else {
            System.out.println(number1 + " is positive ");
        }

        if(number2 < 0)
        {
            System.out.println(number2 + " is negative ");
        } else {
            System.out.println(number2 + " is positive ");
        }

        if(number1 < 100)
        {
            System.out.println(number1 + " is less than 100 ");
        } else {
            System.out.println(number1 + " is more or equals to 100 ");
        }

        if(number2 < 100)
        {
            System.out.println(number2 + " is less than 100 ");
        } else {
            System.out.println(number2 + " is more or equals to 100 ");
        }

    }
}