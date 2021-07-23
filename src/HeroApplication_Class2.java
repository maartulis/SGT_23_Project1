import java.util.Scanner;
public class HeroApplication_Class2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to know the name of our SuperHero?");
        //String str = scan.next();
        //boolean bn = scan.nextBoolean();
        char c = reader.nextChar();

        // Variable initialization
        String heroName;
        String heroCity;
        String heroPower1, heroPower2, heroPower3;
        double heroSalary;
        String realName;
        String universe;
        // Variable assignment
        heroName = "AliexpressMan";
        heroCity = "Dobele";
        heroPower1 = "Super discounts";
        heroPower2 = "Fast delivery";
        heroPower3 = "";
        //isEvil = true;
        heroSalary = 99.99;
        realName = "Artjoms";
        universe = "Ours";
        char positive = 'Y';
        char negative = 'n';
        if (positive == c) {
            System.out.println(heroName);
        }
        else if (negative){
            System.out.println(" ");
        }
        System.out.println("Would you like to know SuperHero city?");
        if (answer1 == true) {
            System.out.println(heroCity);
        }
        //int number1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int number2= scan.nextInt();
        System.out.println("Enter an operator: ");

    }
}