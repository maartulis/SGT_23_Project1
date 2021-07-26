import java.awt.*;
import java.util.Scanner;
public class HeroApplication_Class2 {
    public static void main(String[] args) {

        //Menu for User
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello in Hero Application!");
        System.out.println("1 - I want to see the list of superheroes.");
        System.out.println("2 - I want to see the information about the Hero.");
        System.out.println("3 - I want to create a new Hero.");
        System.out.println("Choose an option, please:");
        int menuOption = scan.nextInt();

        String[] heroNameArray = {"1. AliexpressMan", "2. LatvianMade", "3. WonderMaker"};

        //Menu option 1
        if (menuOption==1) {
            for (int i = 0; i < heroNameArray.length; i++) {
                System.out.println("* "+ heroNameArray[i]);
            }
            System.out.println("Enter number of Hero to see more information:");
        }
        int heroNumber = scan.nextInt();

        //Menu option 2
        if (menuOption==2) {
            for (int i = 0; i < heroNameArray.length; i++) {
                System.out.println("* "+ heroNameArray[i]);
            }
            System.out.println("Enter Hero number to continue:");
        }
        int heroNumber1 = scan.nextInt();

        switch (heroNumber)
        {
            case 1:
                // Variable initialization
                String heroName;
                String heroCity;
                String heroPower1, heroPower2, heroPower3;
                boolean isEvil;
                double heroSalary;
                String realName;
                String universe;

                // Variable assignment
                heroName = "AliexpressMan";
                heroCity = "Dobele";
                heroPower1 = "Super discounts";
                heroPower2 = "Fast delivery";
                heroPower3 = "";
                isEvil = true;
                heroSalary = 99.99;
                realName = "Artjoms";
                universe = "Ours";
                // Print out Hero information card
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");

                System.out.println("Hero name: " + heroName);
                System.out.println("This hero lives in  " + heroCity);

                System.out.println("----------------------------");
                System.out.println("Hero Superpowers:");
                System.out.println("---" + heroPower1);
                System.out.println("---" + heroPower2);
                System.out.println("---" + heroPower3);

                System.out.println("This super hero is evil? " + isEvil);

                System.out.println("This hero earns: " + heroSalary + " EUR");
                System.out.println( realName + " hides his identity.");
                System.out.println("Hero lives in " + universe + " Universe");
                System.out.println();
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");
                // If a hero is a villain or a hero
                if(isEvil) {
                    System.out.println( " Hero is a villain. he is stealing cookies!!!");
                } else {
                    System.out.println("hero protects the city!");
                }
                break;
            case 2:
                // Variable initialization
                String hero1Name;
                String hero1City;
                String hero1Power1, hero1Power2, hero1Power3;
                boolean is1Evil;
                double hero1Salary;
                String real1Name;
                String universe1;

                // Variable assignment
                hero1Name = "LatvianMade";
                hero1City = "Sigulda";
                hero1Power1 = "Good at DIY";
                hero1Power2 = "Love gardening";
                hero1Power3 = "Is always awake";
                is1Evil = false;
                hero1Salary = 200.00;
                real1Name = "Janis";
                universe1 = "Latvia";

                // Print out Hero information card
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");

                System.out.println("Hero name: " + hero1Name);
                System.out.println("This hero lives in  " + hero1City);

                System.out.println("----------------------------");
                System.out.println("Hero Superpowers:");
                System.out.println("---" + hero1Power1);
                System.out.println("---" + hero1Power2);
                System.out.println("---" + hero1Power3);

                System.out.println("This super hero is evil? " + is1Evil);

                System.out.println("This hero earns: " + hero1Salary + " EUR");
                System.out.println(real1Name + " hides his identity.");
                System.out.println("Hero lives in " + universe1 + " Universe");
                System.out.println();
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");


                // If a hero is a villain or a hero
                if (is1Evil) {
                    System.out.println("Hero is a villain. He is stealing apples!!!");
                } else {
                    System.out.println("Hero cleans up garbage from forest!");
                }
                break;

            case 3:
                // Variable initialization
                String hero2Name;
                String hero2City;
                String hero2Power1, hero2Power2, hero2Power3;
                boolean is2Evil;
                double hero2Salary;
                String real2Name;
                String universe2;

                // Variable assignment
                hero2Name = "WonderMaker" ;
                hero2City = "London";
                hero2Power1 = "Makes magic tricks";
                hero2Power2 = "Disappears in smoke";
                hero2Power3 = "No one can catch him";
                is2Evil = false;
                hero2Salary = 1000.00;
                real2Name = "Lary";
                universe2 = "London streets";

                // Print out Hero information card
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");

                System.out.println("Hero name: " + hero2Name);
                System.out.println("This hero lives in  " + hero2City);

                System.out.println("----------------------------");
                System.out.println("Hero Superpowers:");
                System.out.println("---" + hero2Power1);
                System.out.println("---" + hero2Power2);
                System.out.println("---" + hero2Power3);

                System.out.println("This super hero is evil? " + is2Evil);

                System.out.println("This hero earns: " + hero2Salary + " EUR");
                System.out.println(real2Name + " hides his identity.");
                System.out.println("Hero lives in " + universe2 + " Universe");
                System.out.println();
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");


                // If a hero is a villain or a hero
                if (is2Evil) {
                    System.out.println(" Hero is a villain. He is stealing scarves!!!");
                } else {
                    System.out.println("Hero gives free scarves when it is cold!");
                }

                break;

            default:
                System.out.println("Error! Unknown Hero! Sorry!");
        }




    }
}