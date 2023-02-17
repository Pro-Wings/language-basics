package com.prowings.inheritance.heirarchical;

public class TestHeirarchicalInheritance {
	
	public static void main(String[] args) {
		
		Base obj = new Base();
		
		obj.m1();
		obj.m2();
		
		A a = new A();
		a.m1();
		a.m2();
		a.m3();

		B b = new B();
		b.m1();
		b.m2();
//		b.m3();
		
	}

}
