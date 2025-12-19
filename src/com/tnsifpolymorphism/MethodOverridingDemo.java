package com.tnsifpolymorphism;


class AnimalClass{
	void sound() {
		System.out.println("Aminal can make sound");
		
	}
}


class Lion extends AnimalClass{
	void sound() {
		System.out.println("Lion roars");
		
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.sound();
		
		
		
	}
}
