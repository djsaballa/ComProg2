package oop4;

public class HerdingDog extends Dog{

	HerdingDog(String n, String b, String c) {
		super(n, b, c);
	}
	
	HerdingDog(String n, String c) {
		super(n, c);
	}
	
	public void bark() {
		System.out.println("Bark bark~ but I'm herding");
	}
	
	public String herd() {
		return "Get together boi";
	}
	
}
