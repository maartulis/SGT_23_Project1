public class MarinaMStringArrayArtjomTask {
    /*[21:18] Artjoms (Guest) (гость)


Write a program to process String variables:

●      Create a String array with following values: “Copenhagen”, “Paris”, “Tokyo”, “Bristol”, “Mumbai”, “Delhi”, “Riga”, “Vienna”, “Warsaw”, "Hamburg", "Cesis";

●      Find out how many values are starting with ‘C’;

●      Find out how many values are ending with “i”;

●      Find out how many values are with length 5;

●      Find out how many values holds the character “e”;

●      Find out is there any element which holds subString “en”;

●      * create numerical array and, using LOOP fill it with corresponding lengths of values from array with city names, like: Copenhagen = 10, Paris = 5...

*/



        public static void main(String[] args) {
            String[] myArray = {"Copenhagen", "Paris", "Tokyo", "Bristol", "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis" };
            int countFirstLetter = 0;
            int countLastLetter = 0;
            int countLength = 0;
            int countLetter = 0;
            int countElement = 0;


            for (int i = 0; i < myArray.length; i++) {
                //starts with C
                if (myArray[i].charAt(0) == 'C') {
                    countFirstLetter++;
                    //System.out.println(countFirstLetter);
                }
                //ends with i
                if (myArray[i].matches(".*i$")) {
                    countLastLetter++;
                    //System.out.println(countLastLetter);
                }
                //length 5
                if (myArray[i].length() == 5) {
                    countLength++;
                }
                //letter e inside
                if (myArray[i].matches(".*e.*")) {
                    countLetter++;
                    //System.out.println(countLetter);
                    //System.out.println(myArray[i]);
                }
                //element "en" inside
                if (myArray[i].matches(".*en.*")) {
                    countElement++;
                }

            }


            System.out.println("The number of values starting from C is " + countFirstLetter);
            System.out.println("The number of values ending with i is " + countLastLetter);
            System.out.println("The number of values with the length of 5 is " + countLength);
            System.out.println("The number of values with letter e in it is  " + countLetter);
            if (countElement != 0) {
                System.out.println("There is an element with \"en\" inside ");
            }
            //numerical array with names lengths
            System.out.println("The lengths array is: ");
            int[] nameLength = new int[myArray.length];
            for (int j = 0; j < myArray.length; j++) {
                nameLength[j] = myArray[j].length();
                System.out.print(nameLength[j] + " ");
            }
        }


}
