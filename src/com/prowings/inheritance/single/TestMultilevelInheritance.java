package com.prowings.inheritance.single;

public class TestMultilevelInheritance {
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.m1();
		c.m2();
		c.m3();
		
		B b = new B();
		b.m1();
		b.m2();

		A a = new A();
		a.m1();
		
	}

}
