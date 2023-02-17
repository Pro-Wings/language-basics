package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo5 {
	

	public static void add(int...numbers) 
	{
		System.out.println("inside add(int...numbers) method");
	}

	
	public static void add(Integer...numbers) 
	{
		System.out.println("inside add(Integer...numbers) method");
	}

	
	public static void main(String[] args) {
		
		Integer[] x = {10};
//		int[] x = {10};
//		int y = 30;
//		add(y);
		
	}
	
}
