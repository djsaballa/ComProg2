public class Quiz1 {

	public static void main(String[] args) {

		int rows = 3;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
        }
        System.out.println("");
    }
	    
		int count = 2;

		do {
			  System.out.println(count);
			  count++;
		} while (count < 1); 
	    
    boolean youLikeComProg = true;
    
    if (youLikeComProg) {
      System.out.println("Hello, Love, Goodbye");
    } else {
      System.out.println("Hello, Love, Again");
    }

	}

}
