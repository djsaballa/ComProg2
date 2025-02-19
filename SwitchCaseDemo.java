public class SwitchCaseDemo {
	public static void main(String[] args) {
	
		int num = 9;
		
		switch(num) {  // Check expression in switch condition
			case 9:  // Output differs depending on num variable value
				System.out.println("Num is 9");
				break;
			case 10:
				System.out.println("Num is 10");
				break;
			default:
				System.out.println("Num is not 9 or 10");
		}
	}
}
