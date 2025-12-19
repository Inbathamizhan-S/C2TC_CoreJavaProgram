package com.tnsif.inheritance;


class Father{
	void show() {
		System.out.println("this is parent");
	}
	
}
class Son extends Father{
	void display() {
		System.out.println("child");
	}
	
}
public class SingleInheritanceDemo {
	public static void main(String[] args) {
		
		Son s = new Son();
		s.show();
		s.display();
	}
}
