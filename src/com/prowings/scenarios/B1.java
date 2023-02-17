package com.prowings.scenarios;

class A1 {
	public void method1(String s) {
		System.out.println("in A method1");
	}
}

public class B1 extends A1 {
	public void method1() {
		System.out.println("in B method1");
	}

	public static void main(String[] args) {

		A1 a = new B1();
//		a.method1();
	}
}