package com.tnsifpolymorphism;

public class Methodoveloading {
	
	
	int addition(int a,int b) {
		return a+b;
		
	}
	float addition(float a, float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
	
		Methodoveloading mod = new Methodoveloading();
		
		System.out.println("addition is:"+mod.addition(5,10));
		System.out.println("addition is:"+mod.addition(5.5f,7.5f));
	}

}
