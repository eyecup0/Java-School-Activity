import java.util.Scanner;

public class Eggs { 
    public static void main(String[] args) {

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter the number of eggs:");
            int numberOfEggs = userInput.nextInt();

            AvailableEggs(numberOfEggs);
        }
        
 }
    public static void AvailableEggs(int eggs) {

        int Dozen = eggs/12;
        int remainder = eggs%12;

        System.out.print("\n");
        System.out.println("You have " + Dozen + " dozen of eggs with " + remainder + " Eggs remaining.");
        System.out.print("\n");
        System.out.println("End of Program");
        System.out.println("\n");

    }
}