package com.prowings.inheritance;

public class Y extends X{

	public void m2() {
		
		System.out.println("inside implemented m2() from X in Y");
		
	}

	
	public static void main(String[] args) {
		
		
		Y y = new Y();
		
		y.m1();
		y.m2();
		
	}
	
}
