package com.prowings.oops;

import java.util.Scanner;

public class A {

	int id;
	String name;
	String address;

	public A() {
		super();
	}

	public static void method1() // declaration
	{
		System.out.println("inside A - method1()");
	}

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();

		A a3 = a1;

		System.out.println(a1.equals(a2) + "==============="
				+ "================================");
		
		  System.out.println(a1.equals(a3)); Scanner sc = new Scanner(System.in);
		  Math.sqrt(20);
		 method1();// invocation
	}

}
