package oop;

public class UseStudent {

	public static void main(String[] args) {
		Student stud = new Student(123, "First", "Last", "Course");
		
		System.out.println("Student Name: " + stud.fName + " " + stud.lName);
		System.out.println("Student ID: " + stud.id);
		System.out.println("Student Course: " + stud.course);
		stud.studying();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Student.BSIS BSISstud =  stud.new BSIS(321, "Last", "First");
		
		System.out.println("Student Name: " + BSISstud.fName + " " + BSISstud.lName);
		System.out.println("Student ID: " + BSISstud.id);
		System.out.println("Student Course: " + BSISstud.course);
		BSISstud.studying();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");


		Student.ACT ACTstud =  stud.new ACT(132, "Middle", "Last");
		
		System.out.println("Student Name: " + ACTstud.fName + " " + ACTstud.lName);
		System.out.println("Student ID: " + ACTstud.id);
		System.out.println("Student Course: " + ACTstud.course);
		ACTstud.studying();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Student.BSIS.BSISACT BSISACTstud = BSISstud.new BSISACT(312, "First", "Middle");
		
		System.out.println("Student Name: " + BSISACTstud.fName + " " + BSISACTstud.lName);
		System.out.println("Student ID: " + BSISACTstud.id);
		System.out.println("Student Course: " + BSISACTstud.course);
		BSISACTstud.studying();

	}

}
