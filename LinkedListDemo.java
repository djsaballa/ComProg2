import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
	    // Create object of ArrayList
		LinkedList<String> cars = new LinkedList<String>();
	    
		// Add values in the LinkedList
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
		
	    // Add to the Beginning and End
	    cars.addFirst("Chicken");
	    cars.addLast("Pork");
	    System.out.println(cars);
	    
	    // Get the Beginning and End
	    System.out.println(cars.getFirst());
	    System.out.println(cars.getLast());
	    
	    // Remove the Beginning and End
	    cars.removeFirst();
	    cars.removeLast();
	    System.out.println(cars);
	    
	    // Loop to get() each value
	    for (int i = 0; i < cars.size(); i++) {
		    System.out.println(cars.get(i));
	    }
	}
}
