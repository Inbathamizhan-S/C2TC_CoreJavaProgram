package com.tnsif.non_accessmodifier;

abstract class Shape_Example{
	
	abstract void draw();//functionality or declaration
}
class Square extends Shape_Example{
	void draw() {
		System.out.println("Drawing a square");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		 Shape_Example s = new  Square();  //obj can also shared to the ShapeExample cls
		 s.draw();
		 
		 
		
	}
}
