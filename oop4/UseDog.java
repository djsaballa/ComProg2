package oop4;

import java.util.Scanner;

public class UseDog {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = "Yorme";
		
		Dog dog1 = new Dog(name, "Husky", "Black");
			
		System.out.println(dog1.getName());
		System.out.println(dog1.getBreed());
		System.out.println(dog1.getColor());
		
		dog1.setName("Kulet");
		dog1.setBreed("Chowchow");
		
		System.out.println(dog1.getName());
		System.out.println(dog1.getBreed());
//		System.out.println(dog1.name);
		System.out.println(dog1.color);
		
		dog1.roll(0);
		
		Dog dog2 = new Dog("Obet", "Chihuahua", "Brown");
		dog2.roll(3);
		dog2.bark();
		dog2.bark(4);
		dog2.bark("Ako si obet");

		HerdingDog herd1 = new HerdingDog("Silvestre", "Aspin", "Green");
		System.out.println(herd1.getName());
		System.out.println(herd1.herd());
		herd1.bark();
		
		Dog dog3 = new Dog("Laxamana", "Pink");
	}

}
