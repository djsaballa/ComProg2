package oop2;

public class Employee {
	
	int empID;
	String empName;
	String empDept;
	
	// To override the Default Constructor
	// Employee empDefault = new Employee();
	Employee() {
		System.out.println("New employee has been added. ~~Default");
	}
	
	
	// To add parameters to the Constructor
	// Employee empDefault = new Employee(id, name, dept);
	Employee(int i, String n, String d) {
		// this(); // This command is to communicate with the Constructor itself
		empID = i;
		empName = n;
		empDept = d;
		
		System.out.println("Welcome, " + empName + ".");
	}
		
	// Method overloading is to have multiple methods with the same name but they behave differently
	void doWork() {
		System.out.println("I do work, work, work, work~~~");
	}
	
	void doWork(String s) {
		System.out.println("I am an overloaded method ~ string");
	}
	
	void doWork(int s) {
		System.out.println("I am an overloaded method ~ int");
	}
	
	void takeBreak() {
		System.out.println("All employees get a 15 minute break");
	}
}
