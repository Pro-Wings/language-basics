package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo2 {
	

	public static void add(int...numbers) 
	{
		System.out.println("inside add(int...numbers) method");
	}

//	public static void add(int num1) 
//	{
//		System.out.println("inside add(int num1) method");
//	}

//	public static void add(long num1) 
//	{
//		System.out.println("inside add(long num1) method");
//	}

//	public static void add(Integer num1) 
//	{
//		System.out.println("inside add(Integer num1) method");
//	}
	
//	public static void add(int num1, int num2) 
//	{
//		System.out.println("inside add(int num1, int num2) method");
//		int res = num1 + num2;
//		System.out.println(res);
//	}

	
	
	
	public static void main(String[] args) {
		
		
		add(10);
		
	}
	
}
