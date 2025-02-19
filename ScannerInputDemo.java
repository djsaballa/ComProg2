import java.util.Scanner;  // Import the Scanner class

public class ScannerInputDemo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Enter num1: ");
		int num1 = input.nextInt();  // Read user input

		System.out.println("Enter num2: ");
		int num2 = input.nextInt();  // Read user input
		
		System.out.println("Sum: " + (num1 + num2));  // Output user input
		System.out.println("Diff: " + (num1 - num2));  // Output user input
		System.out.println("Quot: " + (num1 / num2));  // Output user input
		System.out.println("Prod: " + (num1 * num2));  // Output user input
		System.out.println("Mod: " + (num1 % num2));  // Output user input
	}
}

