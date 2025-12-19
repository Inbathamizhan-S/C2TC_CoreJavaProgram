package com.tnsif.inheritance;

class PetOwner {
	void show() {
		System.out.println("This is Owner");
	}
}

class pet1 extends PetOwner{
	void display1() {
		System.out.println("This is pet1");
	}
}

class pet2 extends PetOwner {
	void display2() {
		System.out.println("This is pet2");
	}
}

public class HierarchicalInheritanceDemo {
	public static void main(String[] args) {
		pet1 p1 = new pet1();
		p1.show();
		p1.display1();

		pet2 p2 = new pet2();
		p2.show();
		p2.display2();
	}
}

