package com.tnsif.non_accessmodifier;


final public class FinalDemo {

	final int x = 500;
	void print() {
		System.out.println("print val of x :"+x);
	}
	public static void main(String[] args) {
		
		FinalDemo fe = new FinalDemo();
		fe.print();
		
		
	}
}
