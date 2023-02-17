package com.prowings.inheritance;

public class Z implements I{

	public void m1() {
		System.out.println("inside m1() of Z");
	}

	public void m2() {
		System.out.println("inside m2() of Z");
		
	}

	public static void main(String[] args) {
		
		Z z = new Z();
		
		z.m1();
		z.m2();
		
	}
	
}
