package com.prowings.polymorphism.overloading;

public class OverloadingDemo4 {
	
//	public void m1(Integer i)
//	{
//		System.out.println("inside m1(Integer i)");
//	}

//	public void m1(int i)
//	{
//		System.out.println("inside m1(int i)");
//	}

//	public void m1(long i)
//	{
//		System.out.println("inside m1(long i)");
//	}
	
	public void m1(Long i)
	{
		System.out.println("inside m1(Long i)");
	}

	public void m1(Object i)
	{
		System.out.println("inside m1(Object i)");
	}

	
	public static void main(String[] args) {
		
		OverloadingDemo4 obj = new OverloadingDemo4();
		Integer x = 234;
		obj.m1(x);
	}
	
}
