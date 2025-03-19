import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
	
	    // Create object of ArrayList
		ArrayList<String> cars = new ArrayList<String>();
	    
		// First way to use add()
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
		
	    // Second way to use add()
	    cars.add(1, "Buick");
	    cars.add(3, "Honda");
	    System.out.println(cars);
	    
	    // Edit an Item
	    cars.set(2, "Tesla");
	    System.out.println(cars);
	    
	    // Get an Item
	    System.out.println(cars.get(2));
	    
	    // Get Size of ArrayList
	    System.out.println(cars.size());

	    // Remove an Item
	    cars.remove(1);
	    System.out.println(cars);
	    
	    // Clear an Item
	    cars.clear();
	    System.out.println(cars);
	}
	
}
