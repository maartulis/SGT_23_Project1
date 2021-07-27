package com.company;
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
        System.out.println("Please enter 1 if you want to see information about existing hero");
        System.out.println("Please enter 2 if you want to create new hero");
        int menuOption = scan.nextInt();
        String[] heroNameArray = {"1. EbayMan", "2. AliexpressMan", "3. AmazonMan"};


        if (menuOption == 1) {
            for (int i = 0; i < heroNameArray.length; i++) {
                System.out.println(heroNameArray[i]);
            }
            System.out.println("Enter number of Hero to see more information:");
        } else {
            System.out.println("Enter the name of new hero: ");
            String newHeroName = scan.next();
            System.out.println("Enter the city where he lives: ");
            String newHeroCity = scan.next();
            System.out.println("Enter his super power: ");
            String newHeroPower = scan.next();
            System.out.println("Is he evil (true or false)? :");
            Boolean newHeroIsEvil = scan.nextBoolean();
            System.out.println("What is his salary: ");
            Double newHeroSalary = scan.nextDouble();
            System.out.println("Enter his real name: ");
            String newHeroRealName = scan.next();
            System.out.println("Enter the universe he lives in ");
            String newHeroUniverse = scan.next();

            System.out.println("***************************");
            System.out.println("*** HERO INFORMATION ***");
            System.out.println("***************************");

            System.out.println("Hero name: " + newHeroName);
            System.out.println("This hero lives in  " + newHeroCity);

            System.out.println("----------------------------");
            System.out.println("Hero Superpowers:");
            System.out.println("---" + newHeroPower);


            System.out.println(newHeroRealName + " hides his identity.");
            System.out.println("Hero lives in " + newHeroUniverse + " Universe");
            System.out.println();
            System.out.println("***************************");
            System.out.println("*** HERO INFORMATION ***");
            System.out.println("***************************");


            // If a hero is a villain or a hero
            if (newHeroIsEvil) {
                System.out.println(" Hero is a villain. he is stealing cookies!!!");
            } else {
                System.out.println("hero protects the city!");
            }
        }

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

            case 3:

                // Variable assignment
                heroName2 = "AmazonMan";
                heroCity2 = "Peru";
                heroPower4 = "Dropshipping";
                heroPower5 = "Vouchers";
                heroPower6 = "International";
                isEvil = false;
                heroSalary2 = 44447.90;
                realName2 = "Allan";
                universe2 = "Alderaan";

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

            default:
                System.out.println("Unknown hero!");

        }
    }
}