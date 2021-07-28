import java.util.Scanner;

public class Class14_Marina_Gunta_Alexandra_Marina {

    public static void main(String[] args) {

        String [] cities = {"Copenhagen", "Paris", "Tokyo", "Bristol", "Mumbai" ,  "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis"};

        //Class 14
        /**first letter of the name
         *last letter of the name
         *length  of the name
         *other option (up to team to add one or several more)*/
        System.out.println("***Welcome!***");

        System.out.println(" ");


        Scanner scan = new Scanner(System.in);

        System.out.println("***Task_1***");

        System.out.println("Enter the first letter of the cities name: ");
        char firstLetter = scan.next().charAt(0);
        System.out.println("The cities starts with letter " + firstLetter + ": ");
        for (int i=0; i<cities.length; i++) {
            if (cities[i].charAt(0)==firstLetter) {
                System.out.println(cities[i]);
            }
        }

        System.out.println("***Task_2***");

        System.out.println("Enter the last letter of the cities name: ");
        char lastLetter = scan.next().charAt(0);
        System.out.println("The cities ends with letter " + lastLetter + ": ");
        for (int i=0; i<cities.length; i++) {
            int length = cities[i].length();
            if (cities[i].charAt(length-1)==lastLetter) {
                System.out.println(cities[i]);}
        }

        System.out.println("***Task_3***");

        System.out.println("Enter the length of the cities name: ");
        int lengthCity = scan.nextInt();
        System.out.println("The cities with length " + lengthCity + ": ");
        for (int i=0; i<cities.length; i++) {
            if (cities[i].length()== lengthCity) {
                System.out.println(cities[i]);
            }
        }

        /**System.out.println("Enter the substring of the cities name: ");
         String subString = scan.next();
         System.out.println("The cities with substring " + subString + ": ");
         for (int i=0; i<cities.length; i++) {
         String newString = cities[i];
         for (int j=0; j<cities[i].length(); j++) {
         if (newString.charAt(j) = subString.charAt(i)) {
         break;
         }
         }
         System.out.println(cities[i]);
         }*/

        System.out.println("***Task_4***");

        System.out.println("Enter the substring of the cities name: ");
        String subString = scan.next();
        for (String city: cities) {
            if (city.matches(".*" + subString + ".*")) {
                System.out.println("The city matches the Regex: \""  + subString + "\" | " + city);
            }
        }
    }
}

