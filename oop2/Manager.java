package oop2;

public class Manager extends Employee{
		
	void hireEmployee() {
		System.out.println("Only managers can hire an employee.");
	}
	
	void getBonus() {
		System.out.println("Only managers can get bonuses.");
	}
	
	// To Override Parent Class
	void doWork() {
		System.out.println("I do manage, manage, manage, manage~~~");
	}
}

