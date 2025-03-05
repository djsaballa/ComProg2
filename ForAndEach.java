public class ForAndEach {
	public static void main(String[] args) {
		
	    // For Loop
		int prev = 0, current = 1;
	    int n = 10;

	    for (int i = 1; i <= n; i++) {
	    	System.out.print(prev + ", ");

	    	int next = prev + current;
	    	prev = current;
	    	current = next;
	    }

        
	    // Nested Loop
		int rows = 5;
        
	    // Outer Loop
	    for (int i = 1; i <= rows; ++i) {

	        // Inner Loop to print the numbers
	        for (int j = 1; j <= i; ++j) {
	        	System.out.print(j + " ");
	        }
	        System.out.println("");
	    }

        
	    // For-Each Loop
        // Array declaration
        String[] pretties= {"Buenaflor", "Huevos", "Lava", "Teves", "Bronola", "Agnote"};
        
        System.out.println("Listahan ng mga pretty:");
        // Using for-each loop to print each element
        for (String pretty : pretties) {
            System.out.println(pretty);
        }
	}
}
