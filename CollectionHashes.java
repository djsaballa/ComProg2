import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionHashes {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    
		// Collections Demo
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    Collections.sort(cars);
	    System.out.println(cars.get(1));
	    
	    Collections.sort(cars, Collections.reverseOrder());
	    System.out.println(cars);
	    
		// HashMap Demo
	    HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("Philippines", "Manila");
	    capitalCities.put("USA", "Washington");
	    capitalCities.put("Japan", "Tokyo");
	    capitalCities.put("China", "Beijing");

	    System.out.println(capitalCities.get("Japan"));
	    
	    System.out.println("Keys:");
	    for (String i : capitalCities.keySet()) {
	    	System.out.println(i);
	    }
	    
	    System.out.println();

	    System.out.println("Values:");
	    for (String i : capitalCities.values()) {
	    	System.out.println(i);
	    }

		// HashSet Demo
	    HashSet<String> fruits = new HashSet<String>();
	    fruits.add("apple");
	    fruits.add("banana");
	    fruits.add("orange");
	    fruits.add("apple");
	    
	    System.out.println();

	    System.out.println(fruits.contains("apple"));
	    System.out.println(fruits.contains("carrot"));
	    System.out.println(fruits.size());
	}

}
