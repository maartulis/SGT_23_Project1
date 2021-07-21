public class Class11LoopExamplesDoWhileForForEach {
    public static void main(String[] args) {

        //Examples of different loops (WHILE, DO WHILE, FOR)

        //print numbers from 0 to 9 in three different ways (loops):

        int x = 0;

        //while loop example:
        while (x < 10){
            System.out.println("Value of x: " + x);
            x++;
        }

        System.out.println("*********************");

        //do while example:
        x = 0;
        do {
            System.out.println("Value of x: " + x);
            x++;
        } while (x < 10);

        System.out.println("++++++++++++++++++++++++");

        //for loop example:
        for (int i = 0; i < 10; i++){
            System.out.println("Value of i: " + i);
        }

        System.out.println("*********  break and continue examples");
        for (int i = 0; i < 10; i++){
            if (i == 2){
                System.out.println("Stop running remaining code from this loop and start/continuing loop ");
                continue;
            }
            if(i == 5){
                System.out.println("Reached i = " + i  + " stop the rest, exiting loop entirely!");
                break;
            }
            System.out.println("Value of i: " + i);
        }


//Example of duplicating existing array and adding new element at the end of new array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // cars[0] = "Opel";
        System.out.println(cars[0]);

        for (String car: cars ) {
            System.out.println(car);
        }

        String[] carsWithExtras = new String[5];
        for (int i = 0; i < cars.length; i++){
            carsWithExtras[i] = cars[i];
        }
        carsWithExtras[4] = "Opel - extra car, right?";
        System.out.println("------------------------------------");
        for(String listNewCarArray: carsWithExtras){
            System.out.println(listNewCarArray);
        }
        //print out in one line with commas and spaces
        System.out.println("------------------------------------");
        for(String listNewCarArray: carsWithExtras){
            System.out.print(listNewCarArray + ", ");
        }

    }
}
