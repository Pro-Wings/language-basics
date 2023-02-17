package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo4 {
	

	public static void add(int...numbers) 
	{
		System.out.println("inside add(int...numbers) method");
	}

	public static void add(long[] numbers) 
	{
		System.out.println("inside add(long[] ) method");
	}


	
	public static void main(String[] args) {
		
		long[] val = {10l, 20l};
		add(val);
		
	}
	
}
