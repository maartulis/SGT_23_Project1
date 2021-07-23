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
                    hero1Name = "Survivor";
                    hero1City = "London";
                    hero1Power1 = "Eats everything";
                    hero1Power2 = "Can sleep outside";
                    hero1Power3 = "Never is cold";
                    is1Evil = false;
                    hero1Salary = 18.00;
                    real1Name = "James";
                    universe1 = "Our";

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
                        System.out.println("Hero is a villain. He is stealing bananas!!!");
                    } else {
                        System.out.println("Hero cleans up garbage!");
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
                    hero2Name = "The Cook";
                    hero2City = "Helsinki";
                    hero2Power1 = "Is able cook rocks";
                    hero2Power2 = "Creates the most delicious food you've ever had";
                    hero2Power3 = "Never runs out if ideas";
                    is2Evil = false;  // nezinu
                    hero2Salary = 1000.00;
                    real2Name = "Kenny";
                    universe2 = "The Kitchen";

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
                        System.out.println(" Hero is a villain. He is stealing chocolates!!!");
                    } else {
                        System.out.println("Hero feeds everyone!");
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

//            hero1City = "New York";
//
//            switch (hero1City) {
//                case "New York":
//                    hero1Salary = 2000;
//                    break;
//                case "Riga":
//                    hero1Salary = 1200.91;
//                    break;
//                case "Metropolis":
//                    hero1Salary = 1000000;
//                    break;
//                default:
//                    hero1Salary = 100;
//            }
//
//            System.out.println("Hero's new salary: " + hero1Salary);
//            // How many bananas can superhero purchase for his /her salary
//            // 1 banana costs = 1.29 euro
//            System.out.println("**********************************");
//            System.out.println("********** Financials ***************");
//            int numOfBananas = (int) Math.floor(hero1Salary / 1.29);
//            System.out.println(" Hero can purchase " + numOfBananas + " bananas");
//            double averageDailySalary1 = Math.round((hero1Salary / 30));
//            System.out.println(" Hero average daily salary is " + averageDailySalary1 + " euro");


//            hero2City = "Metropolis";
//
//            switch (hero2City) {
//                case "New York":
//                    hero2Salary = 2000;
//                    break;
//                case "Riga":
//                    hero2Salary = 1200.91;
//                    break;
//                case "Metropolis":
//                    hero2Salary = 1000000;
//                    break;
//                default:
//                    hero2Salary = 100;
//            }
//
//            System.out.println("Hero's new salary: " + hero2Salary);
//            // How many chocolates can superhero purchase for his /her salary
//            // 1 chocolate costs = 1.29 euro
//            System.out.println("**********************************");
//            System.out.println("********** Financials ***************");
//            int numOfChocolates = (int) Math.floor(hero2Salary / 1.29);
//            System.out.println(" Hero can purchase " + numOfChocolates + " chocolates");
//            double averageDailySalary2 = Math.round((hero2Salary / 30));
//            System.out.println(" Hero average daily salary is " + averageDailySalary2 + " euro");



            // BUSINESS REQUIREMENTS FOR LESSON #12
            // 1. I would like to see a MENU to select different parts of superhero information card
            // 2. A list of superheroes
            // 3. Add new superhero
            // 4. show specific superhero information
            // 5. Delete the superhero from the list
        }
    }
