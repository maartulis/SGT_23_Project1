public class Team5 {

    public static void main(String[] args) {

        short x, y;

        x = 100;
        y = 4000;

        if (x > y) {
            System.out.println(x + " is the largest value");
        } else {
            System.out.println(y + " is the largest value");
        }


        if (x < y) {
            System.out.println(x + " is the smallest value");
        } else {
            System.out.println(y + " is the smallest value");
        }

        if (x == y) {
            System.out.println(x + " and " + y + " are equal");
        } else {
            System.out.println(x + " and " + y + " are not equal");
        }

        if ((x % 2 == 0) && (y % 2 == 0)) {
            System.out.println("There are no odd numbers");
        } else {
            System.out.println("There are odd numbers");
        }

        if ((x % 2 == 0) && (y % 2 == 0)) {
            System.out.println("There are even numbers");
        } else {
            System.out.println("There are no even numbers");
        }

        if ((x > 0) && (y > 0)) {
            System.out.println("There are no negative numbers");
        } else {
            System.out.println("There are negative numbers");
        }

        if ((x < 0) && (y < 0)) {
            System.out.println("There are no positive numbers");
        } else {
            System.out.println("There are positive numbers");
        }

        if ((x < 100) || (y < 100)) {
            System.out.println("There are numbers with value less than 100");
        } else {
            System.out.println("There are no numbers with value less than 100");
        }

        int sum = x + y;
        System.out.println(sum);

        double result = y - x;
        double roundOff = Math.round(result * 100.00) / 100.00;
        //double roundOff = (double) Math. round(result * 100) / 100;
        System.out.println(roundOff);

        double result2 = (x - y);
        double roundOff2 = Math.round(result2 * 100.00) / 100.00;
        System.out.println(Math.abs(roundOff2));

    }

}
