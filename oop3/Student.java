package oop;

public class Student {
	
	int id;
	String fName;
	String lName;
	String course;
	
	Student() {
		System.out.println("Welcome, new student.");
	}
	
	Student(int i, String f, String l, String c) {
		id = i;
		fName = f;
		lName = l;
		course = c;
	}
	
	public void studying() {
		System.out.println("Studying~~~");
	}
	
	public class BSIS {
		int id;
		String fName;
		String lName;
		String course = "BSIS";
		
		BSIS(int i, String f, String l) {
			id = i;
			fName = f;
			lName = l;

			System.out.println("Welcome, new BSIS student.");
		}
		
		public void studying() {
			System.out.println("BSIS Studying~~~");
		}
		
		public class BSISACT {
			int id;
			String fName;
			String lName;
			String course = "BSIS ACT";
			
			BSISACT(int i, String f, String l) {
				id = i;
				fName = f;
				lName = l;

				System.out.println("Welcome, new ACT student.");
			}
			
			public void studying() {
				System.out.println("BSIS ACT Studying~~~");
			}

		}

	}
	
	public class ACT {
		int id;
		String fName;
		String lName;
		String course = "ACT";
		
		ACT(int i, String f, String l) {
			id = i;
			fName = f;
			lName = l;

			System.out.println("Welcome, new BSIS ACT student.");
		}
		
		public void studying() {
			System.out.println("ACT Studying~~~");
		}

	}

}
