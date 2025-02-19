import java.util.Scanner;  // Import the Scanner class

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  // Create a Scanner object

		System.out.println("Pogi ba? (Yes/No)");
		String yesNo = input.nextLine();  // Read user input
				
		if (yesNo.equalsIgnoreCase("yes")) {  // if conditional statement
			System.out.println("Kaloob");
		} else if (yesNo.equalsIgnoreCase("no")) {  // else if conditional statement
			System.out.println("Tungkulin muna");
		} else {  // default output
			System.out.println("Invalid input");
		}
	}
}
