import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] cars = {"BMW", "Volvo", "Audi", "Ford"};
		
		System.out.println(cars[2]);
		System.out.println(cars.length);

		System.out.println("-------------------");
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("-------------------");

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("-------------------");
		
		cars[2] = "Buick";
		
		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("-------------------");


		String[] vroomVrooms = new String[4];
		
		System.out.print("Enter a car brand:");
		String car0 = input.nextLine();
		
		System.out.print("Enter a car brand:");
		String car1 = input.nextLine();

		System.out.print("Enter a car brand:");
		String car2 = input.nextLine();

		System.out.print("Enter a car brand:");
		String car3 = input.nextLine();
		
//		System.out.print("Enter a car brand:");
//		String car4 = input.nextLine();
		
		vroomVrooms[0] = car0;
		vroomVrooms[1] = car1;
		vroomVrooms[2] = car2;
		vroomVrooms[3] = car3;
//		vroomVrooms[4] = car4;
		
		for (String vroomVroom : vroomVrooms) {
			System.out.println(vroomVroom);
		}
				
	}
}
