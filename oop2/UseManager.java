package oop2;

public class UseManager {
	
	public static void main(String[] args) {
		
		Manager mngrDefault = new Manager();
		// From Child Class
		mngrDefault.getBonus();
		
		// From Parent Class
		mngrDefault.takeBreak();
		
		// Override Parent Class
		mngrDefault.doWork();
		
	}
}
