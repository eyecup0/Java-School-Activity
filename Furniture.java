import java.util.Scanner;

public class Furniture {


	private static int PINE_WOOD_TABLE_PRICE = 100;
	private static int OAK_WOOD_TABLE_PRICE = 225;
	private static int MAHOGANY_WOOD_TABLE_PRICE = 310;

	public static void main(String[] args) {
		System.out.println("Select a type of Wood");
		System.out.println("1 Pine");
		System.out.println("2 Oak");
		System.out.println("3 Mahogany");


		byte Choices = 0;
		
		
		try (Scanner userInput = new Scanner(System.in)) {
            try {
            	Choices = userInput.nextByte();
            } 
            
            catch (Exception e) {
            	System.out.println("Enter a number.");
            	System.exit(1);
            }
        }
		switch (Choices) {
		case 1:
			printTableInformation("Pine", PINE_WOOD_TABLE_PRICE);
			break;
		case 2:
			printTableInformation("Oak", OAK_WOOD_TABLE_PRICE);
			break;
		case 3:
			printTableInformation("Mahogany", MAHOGANY_WOOD_TABLE_PRICE);
			break;
		default:
            System.out.println("No wood chosen, Table price: $0 ");
			System.out.println("Please select 1, 2 or 3.");
			break;
		}
	}


	private static void printTableInformation(String wood, int price) {
		System.out.println("Wood chosen: " + wood + "; Table price: $" + price);
	}

}