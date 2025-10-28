package oop4;

public class Dog {

	private String name, breed;
	String color;
	
	Dog(String n, String b, String c) {
		this.name = n;
		this.breed = b;
		this.color = c;
		
		System.out.println("I made a Dog object w/ 3 params");
	}
	
	Dog(String n, String c) {
		this.name = n;
		this.color = c;
		
		System.out.println("I made a Dog object w/ 2 params");
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public String getColor() {
		return this.color;
	}
		
	public void bark(int n) {
		int i = 1;
		while (i <= n) {
			System.out.println("Mark mark~ " + i);
			i++;
		}
	}
	
	public void bark(String s) {
		System.out.println(s);
	}
	
	public void bark() {
		System.out.println("Bark bark~");
	}

	public void roll(int n) {
		// gugulong parin kasi makulit yung aso
		int i = 1;
		do {
			System.out.println(this.name + ": Roll roll~ " + i);
			i++;
		} while (i <= n);
	}
	
	
}
