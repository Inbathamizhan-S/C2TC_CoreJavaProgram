package com.tnsif.inheritance;

class GrandParent{
	void show(){
	System.out.println("This is GrandParent");
	}
}

class Parent extends GrandParent{
	
	void display() {
		System.out.println("This is Parent");
		
	}
}

class Child extends Parent{
	
	void print() {
		System.out.println("This is child");
	}
}

public class MultilevelInheritanceDemo {
	
  public static void main(String[] args) {
  
	  Child c = new Child();
	  c.display();
	  c.show();
	  c.print();
  }
}
  
 	
	

