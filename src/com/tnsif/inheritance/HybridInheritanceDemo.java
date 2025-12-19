package com.tnsif.inheritance;

//single + hierarchial inheritance

class Parent3 {
	void show() {
		System.out.println("Parent class");
	}
}

class Child1 extends Parent3 {
	void display1() {
		System.out.println("Child1 class");
	}
}

class Child2 extends Parent3 {
	void display2() {
		System.out.println("Child2 class");
	}
}

class SubChild extends Child1 {
	void print() {
		System.out.println("SubChild class");
	}
}


public class HybridInheritanceDemo {

	public static void main(String[] args) {
		SubChild sc = new SubChild();
		sc.show();
		sc.display1();
		sc.print();

		Child2 c2 = new Child2();
		c2.show();
		c2.display2();
	}
		
		
	}

