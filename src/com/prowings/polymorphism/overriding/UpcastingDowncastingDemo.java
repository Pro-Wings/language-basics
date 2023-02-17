package com.prowings.polymorphism.overriding;

class Parent1
{
	public void m1()
	{
		System.out.println("Parent - m1()");
	}

	public static void m2()
	{
		System.out.println("Parent - m2()");
	}

}

class Child1 extends Parent1
{
	public void m1()
	{
		System.out.println("Child - m1()");
	}
	
	public static void m2()
	{
		System.out.println("Child - m2()");
	}

}


public class UpcastingDowncastingDemo {
	
public static void main(String[] args) {

	Parent1 p1 = new Parent1();
	Parent1 p2 = new Child1(); //upcasting - implicit
	
	Child1 c1  = new Child1();
	
//	Child1 c1  = new Parent1(); //This is not possible : Child can not hold Parent
	
//	Child1 c2 = (Child1)p1;
	
	Child1 c3 = (Child1) p2;
	
	c3.m1();
	
	Parent1 p5 = new Child1();
	
	p5.m2();
	
}	

}
