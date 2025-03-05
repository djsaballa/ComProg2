public class DoAndWhile {
	public static void main(String[] args) {
    
		// While Demo
		int countdown = 3;
	
		while (countdown > 0) {
		  System.out.println(countdown);
		  countdown--;
		}
		
		// Do/While Demo	
		do {
		  System.out.println(countdown);
		  countdown++;
		}
		while (countdown < 3);

	}
}
