public class ComputerRun {

    public static void main(String[] args) {
	// write your code here
        //creating object with constructor without arguments
        Computer c1 = new Computer();
        //printing out using getter to retrieve information from object / instance
        System.out.println("Size of PC c1 = " + c1.getSizeInches());

        //creating object with constructor WITH arguments
        Computer c2 = new Computer(13.4f, 3.0f, "Black", (short) 8, 500);
        //printing out using getter to retrieve information from object / instance
        System.out.println("Size of PC c2 = " + c2.getSizeInches() );
        System.out.println("Color: " + c2.getColor());
    }
}
