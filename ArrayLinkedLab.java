import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLinkedLab {
	
	public static void reverseString(String word) {
		for (int i = word.length() - 1; i > -1; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println("");
	}
	
	public static void palindromeChecker(String word) {
		String palindrome = "";
		for (int i = word.length() - 1; i > -1; i--) {
			palindrome += word.charAt(i);
		}
		
		if (palindrome.equalsIgnoreCase(word)) {
			System.out.println("This is a palindrome.");
		} else {
			System.out.println("This is not a palindrome.");
		}
	}
	
	public static void findColor(String userColor, ArrayList<String> colors) {
		boolean found = false;

		for (String color : colors) {
			if (color.equalsIgnoreCase(userColor)) {
				System.out.println("The color, " + userColor + ", exists in the ArrayList.");
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("The color, " + userColor + ", does not exists in the ArrayList.");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
				
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		colors.add("indigo");
		colors.add("violet");
		
		colors2.add("black");
		colors2.add("pink");
		colors2.add("white");
		colors2.add("gray");
		
		System.out.print("Enter a color: ");
		String userColor = input.nextLine();
		
		findColor(userColor, colors);
		findColor(userColor, colors2);
		
		reverseString(userColor);
		
		palindromeChecker(userColor);
	}
}
