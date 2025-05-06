import java.util.HashMap;
import java.util.HashSet;

public class HashActivity {

	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<String, Integer>();
		
		students.put("Student 1", 12345);
		students.put("Student 2", 11234);
		students.put("Student 3", 11123);
		students.put("Student 4", 11112);
		students.put("Student 5", 11111);
		
		System.out.println("HashMap Activity");
		
		System.out.println("HashMap 1");
		for (String student : students.keySet()) {
			System.out.println("Name: " + student + ", ID: " + students.get(student));
		}
		
		HashMap<String, Integer> students2 = new HashMap<String, Integer>();

		System.out.println();
		System.out.println("HashMap 2");
		for (String student : students.keySet()) {
			students2.put(student, students.get(student));
		}
		
		students2.put("Student 6", 54321);
		for (String student : students2.keySet()) {
			System.out.println("Name: " + student + ", ID: " + students2.get(student));
		}
		
		System.out.println();
		System.out.println("HashSet Activity");
		HashSet<String> colors1 = new HashSet<String>();
	    colors1.add("red");
	    colors1.add("blue");
	    colors1.add("pink");
	    colors1.add("yellow");
	    colors1.add("green");

	    HashSet<String> colors2 = new HashSet<String>();
	    colors2.add("red");
	    colors2.add("blue");
	    colors2.add("white");
	    colors2.add("black");
	    colors2.add("peach");
	    
		System.out.println("HashSet 1");
	    for (String i : colors1) {
	    	if (colors2.contains(i)) {
	    		System.out.println("The color, " + i + ", does exist in the Second HashSet.");
	    	} else {
	    		System.out.println("The color, " + i + ", does not exist in the Second HashSet.");
	    	}
	    }
	    
		System.out.println();
	    
		System.out.println("HashSet 2");
	    for (String i : colors2) {
	    	if (colors1.contains(i)) {
	    		System.out.println("The color, " + i + ", does exist in the First HashSet.");
	    	} else {
	    		System.out.println("The color, " + i + ", does not exist in the First HashSet.");
	    	}
	    }
    
	}
  
}
