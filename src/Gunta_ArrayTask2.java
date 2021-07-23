public class Gunta_ArrayTask2 {

    public static void main(String[] args) {

        /** int[] myList = {2, 5, 6, 8, 10, 15};

         for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i]);}

         for ( int i = myList.length-1; i >= 0; i--) {
         System.out.println(myList[i]);} */

        int[] myList = {30, 15, 15, 3, 15, 12, 13};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<myList.length; i++) {
            if(myList[i]>max ) {
                secmax = max;
                max=myList[i];
            }else if(myList[i]>secmax) {
                secmax = myList[i];
            }else if(myList[i] > min) {
                min = myList[i];
            }
        }
        System.out.println("1st highest value: " + max);
        System.out.println("2nd highest value: " + secmax);
        System.out.println("lowest value: " + min);


    }
}

/** System.out.println("----------------------------------" );
 int [] my2Array = {30, 15, 15, 3, 15, 12, 13};
 int min = my2Array[0];
 //int another_max = my2Array[0];
 int max = my2Array[0];
 for (int i = 0; i < 6; i++) {
 if (my2Array[i] <= min){
 min = my2Array[i];
 }

 if (my2Array[i] > max){
 max = my2Array[i];
 }
 }
 int another_max = min;
 for (int i = 0; i < 6; i++) {
 if (my2Array[i] > another_max && my2Array[i] < max){
 another_max = my2Array[i];
 }
 }

 System.out.println("Minimum is: " + min);
 System.out.println("Maximum is: " + max);
 System.out.println("The second highest number is: " + another_max);

 }
 }

 */