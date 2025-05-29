import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Quiz2 {

	public static void main(String[] args) {
		
		// add(), .add(), add(index, value)
		
    // ArrayList Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");
	    
		ArrayList<String> cars1 = new ArrayList<String>();
		
		cars1.add("Volvo");
		cars1.add("BMW");
		cars1.add("Ford");
		cars1.add("Mazda");
		cars1.add(2, "Honda");
    System.out.println(cars1);
    
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // LinkedList Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");
	    
		LinkedList<String> cars2 = new LinkedList<String>();

		cars2.add("Volvo");
		cars2.add("BMW");
		cars2.add("Ford");
		cars2.add("Mazda");
		cars2.addFirst("Honda");
		cars2.removeLast();
    System.out.println(cars2);
    
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	    // Array Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");
		String[] cars3 = {"BMW", "Volvo", "Audi", "Ford"};
		
		System.out.print(cars3[2]);
		System.out.println(cars3.length);
		
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

  // Collections Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    System.out.println("Answer: ");
	    
		ArrayList<String> cars4 = new ArrayList<String>();
		cars4.add("Volvo");
		cars4.add("BMW");
		cars4.add("Ford");
		cars4.add("Mazda");
    Collections.sort(cars4);
    Collections.sort(cars4, Collections.reverseOrder());
    System.out.println(cars4);
    
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

  // HashMap Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");

    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("Philippines", "Manila");
    capitalCities.put("USA", "Washington");
    capitalCities.put("Japan", "Tokyo");
    capitalCities.put("China", "Beijing");
	    
    for (String country : capitalCities.keySet()) {
      System.out.println(capitalCities.get(country));
    }
    
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

  // HashSet Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");

    HashSet<String> fruits = new HashSet<String>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("apple");
    
    System.out.println(fruits);

    System.out.println(fruits.contains("apple"));
    System.out.println(fruits.contains("carrot"));
    System.out.println(fruits.size());
    
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    
  // Iterator Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");
	    
		ArrayList<String> cars5 = new ArrayList<String>();
		cars5.add("Volvo");
		cars5.add("BMW");
		cars5.add("Ford");
		cars5.add("Mazda");
	    
		Iterator<String> itCars = cars5.iterator();
		
		while (itCars.hasNext()) {
			String temp = itCars.next();
			if (temp.equals("ford")) {
				itCars.remove();
			}
		}
		System.out.println(cars5);

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  
  // Wrapper Class Question
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Answer: ");

		String s = "Crocodillo";
		Integer i = 36;
		
		String iString= i.toString();
		
		System.out.println(i + 36);
		System.out.println(iString + 36 + iString);
		System.out.println(iString.concat("36"));
		System.out.println(s.length());

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}

}
