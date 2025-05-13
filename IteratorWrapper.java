import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWrapper {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ferrari");
		cars.add("Tesla");
		cars.add("Toyota");
		cars.add("Lamborgini");
		cars.add("Mercedes Benz");

		Iterator<String> itCars = cars.iterator();
		
		System.out.println(cars);

		while (itCars.hasNext()) {
			String temp = itCars.next();
			//itCars.next().equalsIgnoreCase("toyota")
			if (temp.equalsIgnoreCase("toyota")) {
				itCars.remove();
			}
		}
		System.out.println(cars);
		
		String s = "Mahusay";
		Integer i = 36;
		
		String iString= i.toString();
		
		System.out.println(i + 36);
		System.out.println(iString + 36 + iString);
		System.out.println(iString.concat("36"));
		System.out.println(s.length());
	}

}
