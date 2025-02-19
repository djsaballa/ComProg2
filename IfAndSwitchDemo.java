public class IfAndSwitch {
	public static void main(String[] args) {
		// If-Else Demo
		String monthIf = "February";
		
		if (monthIf == "January" || monthIf == "March" || monthIf == "May" || monthIf == "July" || monthIf == "August" || monthIf == "October" || monthIf == "December") {
			System.out.println("31 days");
		} else if (monthIf == "February") {
			System.out.println("28 or 29 days");
		} else {
			System.out.println("30 days");
		}
		
		
		// Switch-Case Demo
		int monthSwitch = 5;
		
		switch (monthSwitch) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days");
				break;
			case 2:
				System.out.println("28 or 29 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 days");
				break;
			default:
				System.out.println("Not a valid month!"); 
		}
	}
}
