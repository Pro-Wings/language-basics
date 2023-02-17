package com.prowings.polymorphism.overloading;

public class OverloadingObjectTypeParamMethods {
	
	public void m1(Integer i)
	{
		System.out.println("inside m1(Integer i)");
	}

	public void m1(Long i)
	{
		System.out.println("inside m1(Long i)");
	}
	
	public void m1(Character i)
	{
		System.out.println("inside m1(Character i)");
	}

	public void m1(Number i)
	{
		System.out.println("inside m1(Number i)");
	}
	public void m1(Object i)
	{
		System.out.println("inside m1(Object i)");
	}

	
	public static void main(String[] args) {
		
		OverloadingObjectTypeParamMethods obj = new OverloadingObjectTypeParamMethods();
		
		Integer x = 100;

//		obj.m1(null);
		
	}
	
}
