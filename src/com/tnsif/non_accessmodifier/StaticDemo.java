package com.tnsif.non_accessmodifier;

public class StaticDemo {
	
	//static variable
	
	static int count;
	
	int variable20; //static variable
	//static block
	static {
		count =15;
		System.out.println("showing the static variable's count:"+count);
	}
	//static method
	static void display() {
		System.out.println("showing the static variable's count:"+count);
		
	}
public static void main(String[] args) {
	
	System.out.println("printing main method");
	display();
	
}
}
