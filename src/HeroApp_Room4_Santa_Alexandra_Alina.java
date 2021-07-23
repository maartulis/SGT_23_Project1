import java.util.Scanner;

public class HeroApp_Room4_Santa_Alexandra_Alina {

        public static void main(String[] args) {

            //Menu for User
            Scanner scan = new Scanner(System.in);
            System.out.println("Hello in Hero Application!");
            System.out.println("1 - I want to see the list of superheroes.");
            System.out.println("2 - I want to see the information about the Hero.");
            System.out.println("3 - I want to create a new Hero.");
            System.out.println("Choose an option, please:");
            int menuOption = scan.nextInt();

            String[] heroNameArray = {"1. AliexpressMan", "2. Survivor", "3. The Cook"};

            if (menuOption==1) {
                for (int i = 0; i < heroNameArray.length; i++) {
                    System.out.println("* "+ heroNameArray[i]);
                }
            }

            System.out.println("Enter number of Hero to see more information:");
            int heroNumber = scan.nextInt();

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
                default:
             System.out.println("Error! Unknown Hero! Sorry!");
            }


            /**heroCity = "Metropolis";

            switch (heroCity) {
                case "New York":
                    heroSalary = 2000;
                    break;
                case "Riga":
                    heroSalary = 1200.91;
                    break;
                case "Metropolis":
                    heroSalary = 1000000;
                    break;
                default:
                    heroSalary = 100;
            }

            System.out.println("Hero's new salary: " + heroSalary);
            // How many cookies can superhero purchase for his /her salary
            // 1 cookie costs = 1.29 euro
            System.out.println("**********************************");
            System.out.println("********** Financials ***************");
            int numOfCookies = (int)Math.floor(heroSalary / 1.29);
            System.out.println(" Hero can purchase " + numOfCookies + " cookies");
            double averageDailySalary = Math.round( (heroSalary / 30 )  ) ;
            System.out.println(" Hero average daily salary is " + averageDailySalary + " euro");*/



            // BUSINESS REQUIREMENTS FOR LESSON #12
            // 1. I would like to see a MENU to select different parts of superhero information card
            // 2. A list of superheroes
            // 3. Add new superhero
            // 4. show specific superhero information
            // 5. Delete the superhero from the list
        }
    }
