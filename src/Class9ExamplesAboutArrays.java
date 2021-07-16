public class Class9ExamplesAboutArrays {

        public static void main(String[] args) {
            int number = 5;
            int number2 = 10;
            System.out.println(number + " - " + number2);

            number = number2;
            System.out.println(number + " - " + number2);

            //delcare int variable
            int myNumber;

            //declare array
            int[] myList;

            //create new array with size and assign reference of this array
            //to variable "myList"
            //Default value for all primitive data type numbers is 0
            myList = new int[10];

            //outputting / accessing the value of the 6th element in array
            System.out.println("myList[5] - " + myList[5]);

            // updating element in array
            myList[5] = 25;
            System.out.println("myList[5] - " + myList[5]);

            // check the size of the array
            System.out.println("Size of myList is " + myList.length);

            //example of boolean array
            //the default value for boolean primitives is always false
            boolean[] booleanList = new boolean[3];
            System.out.println("booleanList[1] " + booleanList[1]);

            // another way to declare and initialize
            //  index nr. -   0  1  2
            int[] myList2 = {10, 5, 6};

            //examples of accessing elements in array
            System.out.println("myList2[0] (first element in the myList2 " + myList2[0]);
            System.out.println("last element of myList2 - " + myList2[2]);

            //trying to access non-existing element (using wrong index)
            //System.out.println(myList2[3]);

            System.out.println(" *********** ");
            //outputting all values in array without loop
            int[] myList3 = {110, 55, 50};
            System.out.println(myList3[0]);
            System.out.println(myList3[1]);
            System.out.println(myList3[2]);

            System.out.println(" *********** ");
            for (int i = 0; i < 3; i++){
                System.out.println(myList3[i]);
            }

            System.out.println(" *********** ");
            for (int i = 0; i < myList3.length; i++){
                System.out.println(myList3[i]);//1 ; 2
            }

            for(int i = 0; i <= 10; i++){
                System.out.println("Current iteration: " + i);
            }
        }
    }

