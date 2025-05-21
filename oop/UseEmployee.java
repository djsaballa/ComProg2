package oop;

public class UseEmployee {
	
	public static void main(String[] args) {
		Employee myEmp = new Employee();
		myEmp.empID = 14987;
		myEmp.firstName = "DJ";
		myEmp.lastName = "Saballa";
		myEmp.jobTitle = "Java Programmer";
	
		System.out.println("Welcome our new Employee, " + myEmp.firstName + " " + myEmp.lastName);
		System.out.println("Employee ID: " + myEmp.empID);
		System.out.println("Job Title: " + myEmp.jobTitle);
		
		System.out.println( myEmp.doWork() );
	}
}
