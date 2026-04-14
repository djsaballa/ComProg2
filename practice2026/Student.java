package practice2026;

public class Student {
	private String firstName;
	private String lastName;
	private String studentID;

	Student(String firstName, String ln, String id) {
		this.firstName = firstName;
		this.lastName = ln;
		this.studentID = id;
	}
	
	public void displayInfo() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Student ID: " + this.studentID);
	}
	
	public void takeBreak() {
		System.out.println("take a break as student");
	}
	
	public void studying() {
		System.out.println("study as student");
	}
	
}
