package practice2026;

public class UseClasses {

	public static void main(String[] args) {
		Student stud = new Student("First1", "Last1", "012345");
		BSIS BSISstud = new BSIS("First2", "Last2", "012345", "BSIS");
		ACT ACTstud = new ACT("First3", "Last3", "012345", "ACT");
		
		System.out.println("Student:");
		stud.displayInfo();
		stud.takeBreak();
		stud.studying();
		
		System.out.println();
		System.out.println("BSIS:");
		stud.displayInfo();
		BSISstud.takeBreak();
		BSISstud.programming();
		BSISstud.studying();
		
		System.out.println();
		System.out.println("ACT:");
		stud.displayInfo();
		ACTstud.takeBreak();
		ACTstud.studying();
		ACTstud.studying(5);
	}

}
