package oop2;

import java.util.Scanner;
import java.util.Random;

public class UseEmployee {
	
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");

		// Default Constructor
		System.out.println("~~Using Default Constructor~~");
		Employee empDefault = new Employee();
		empDefault.empName = "DJ Saballa";
		empDefault.empID = 3182017;
		empDefault.empDept = "Human Resources";		
		System.out.println("Employee Name: " + empDefault.empName);
		System.out.println("Employee ID: " + empDefault.empID);
		System.out.println("Employee Department: " + empDefault.empDept);
		
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");

		//Method Overloading
		System.out.println("~~Method Overloading~~");
		empDefault.doWork();
		empDefault.doWork("string");
		empDefault.doWork(12345);
		
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		
		// Constructor with Parameters
		System.out.println("~~Using Constructor with Parameters~~");

		Scanner input = new Scanner(System.in);
		Random random = new Random();
				
		int id = random.nextInt(100000);
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Department: ");
		String dept = input.nextLine();

		Employee empDS = new Employee(id, name, dept);
		System.out.println("Employee Name: " + empDS.empName);
		System.out.println("Employee ID: " + empDS.empID);
		System.out.println("Employee Department: " + empDS.empDept);
		
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
}