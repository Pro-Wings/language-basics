package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo {
	
	
//	public static void add(int...nums) //var-arg method - this can accept 0 or n number of args
//	{
//		System.out.println("inside add(int...nums) method");
//		int res = 0;
//		for(int i = 0; i<nums.length; i++)
//		{
//			System.out.println(nums[i]);
//			res += nums[i];
//		}
//		System.out.println("addition of var args is : "+res);
//		
//	}

//	public static void add(int num) 
//	{
//		System.out.println("inside add(int num) method");
//	}

	public static void add(int num, long...numbers) 
	{
		System.out.println("inside add(int num) method");
		
		System.out.println("num : "+num);
		
		System.out.println(numbers);
		
	}

	public static void add(int num1, int num2) 
	{
		System.out.println("inside add(int num1, int num2) method");
		int res = num1 + num2;
		System.out.println(res);
	}

	
	
	
	public static void main(String[] args) {
		
		
		add(10, 20, 30);
		
	}
	
}
