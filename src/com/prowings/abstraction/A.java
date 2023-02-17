package com.prowings.abstraction;

public abstract class A {
	
	int id;
	String name;

	public A() {
		super();
	}

	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void printA()
	{
		System.out.println(this.id);
		System.out.println(this.name);
	}

	
	
}
