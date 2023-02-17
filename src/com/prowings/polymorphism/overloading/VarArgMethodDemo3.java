package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo3 {
	

//	public static void add(int...numbers) 
//	{
//		System.out.println("inside add(int...numbers) method");
//	}

	public static void add(long...numbers) 
	{
		System.out.println("inside add(long...numbers) method");
	}
	
	
	public static void main(String[] args) {
		
		int x= 30;
		int y= 40;
		int z= 70;
		add(x,y,z);
		
	}
	
}
