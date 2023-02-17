package com.prowings.inheritance;

public class B extends A{
	
	public void m4()
	{
		System.out.println("inside m4() of B");
	}

	public static void main(String[] args) {
		
		B b = new B();
		
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		
	}
	
}
