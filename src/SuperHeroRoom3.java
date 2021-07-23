import java.util.Scanner;

public class SuperHeroRoom3 {

    public static void main(String[] args) {
        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. show specific superhero information
        // 5. Delete the superhero from the list
        // Variable initialization
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello in Hero Application!");
        System.out.println("1 - I want to see the list of superheroes.");
        System.out.println("2 - I want to see the information about the Hero.");
        System.out.println("3 - I want to create a new Hero.");
        System.out.println("Choose an option, please:");
        int menuOption = scan.nextInt();

        String[] heroNameArray = {"1. EbayMan", "2. AliexpressMan", "3. NewHero"};

        if (menuOption == 1) {
            for (int i = 0; i < heroNameArray.length; i++) {
                System.out.println("* " + heroNameArray[i]);
            }
        }

        System.out.println("Enter number of Hero to see more information:");
        int heroNumber = scan.nextInt();
        scan.close();

        switch (heroNumber) {
            case 1:

                String heroName2;
                String heroCity2;

                String heroPower4, heroPower5, heroPower6;

                boolean isEvil;

                double heroSalary2;
                String realName2;

                String universe2;

                // Variable assignment
                heroName2 = "EbayMan";
                heroCity2 = "Jelgava";
                heroPower4 = "Betting";
                heroPower5 = "International delivery";
                heroPower6 = "Cheap";
                isEvil = false;
                heroSalary2 = 300.00;
                realName2 = "Peteris";
                universe2 = "Marvel";

                // Print out Hero information card
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");

                System.out.println("Hero name: " + heroName2);
                System.out.println("This hero lives in  " + heroCity2);

                System.out.println("----------------------------");
                System.out.println("Hero Superpowers:");
                System.out.println("---" + heroPower4);
                System.out.println("---" + heroPower5);
                System.out.println("---" + heroPower6);

                System.out.println("This super hero is evil? " + isEvil);

                System.out.println("This hero earns: " + heroSalary2 + " EUR");
                System.out.println(realName2 + " hides his identity.");
                System.out.println("Hero lives in " + universe2 + " Universe");
                System.out.println();
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");


                // If a hero is a villain or a hero
                if (isEvil) {
                    System.out.println(" Hero is a villain. he is stealing cookies!!!");
                } else {
                    System.out.println("hero protects the city!");
                }
                break;

            case 2:
                heroName2 = "AliexpressMan";
                heroCity2 = "Dobele";
                heroPower4 = "Super discounts";
                heroPower5 = "Fast delivery";
                heroPower6 = "";
                isEvil = true;
                heroSalary2 = 99.99;
                realName2 = "Artjoms";
                universe2 = "Ours";

                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");

                System.out.println("Hero name: " + heroName2);
                System.out.println("This hero lives in  " + heroCity2);

                System.out.println("----------------------------");
                System.out.println("Hero Superpowers:");
                System.out.println("---" + heroPower4);
                System.out.println("---" + heroPower5);
                System.out.println("---" + heroPower6);

                System.out.println("This super hero is evil? " + isEvil);

                System.out.println("This hero earns: " + heroSalary2 + " EUR");
                System.out.println(realName2 + " hides his identity.");
                System.out.println("Hero lives in " + universe2 + " Universe");
                System.out.println();
                System.out.println("***************************");
                System.out.println("*** HERO INFORMATION ***");
                System.out.println("***************************");


                // If a hero is a villain or a hero
                if (isEvil) {
                    System.out.println(" Hero is a villain. he is stealing cookies!!!");
                } else {
                    System.out.println("hero protects the city!");
                }
                break;

            default:
                System.out.println("Unknown hero!");

                /*// How many cookies can superhero purchase for his /her salary
                // 1 cookie costs = 1.29 euro
                System.out.println("**********************************");
                System.out.println("********** Financials ***************");
                int numOfCookies = (int) Math.floor(heroSalary2 / 1.29);
                System.out.println(" Hero can purchase " + numOfCookies + " cookies");
                double averageDailySalary = Math.round((heroSalary2 / 30));
                System.out.println(" Hero average daily salary is " + averageDailySalary + " euro");

            heroCity2 = "Metropolis";

            switch (heroCity2) {
                case "New York":
                    heroSalary2 = 2000;
                    break;
                case "Riga":
                    heroSalary2 = 1200.91;
                    break;
                case "Metropolis":
                    heroSalary2 = 1000000;
                    break;
                default:
                    heroSalary2 = 100;

                    System.out.println("Hero's new salary: " + heroSalary2);*/
            }
        }
    }