package com.prowings.polymorphism.overriding;

public class TestException2 {
	
	public static void main(String[] args) 
	{
		
		System.out.println("main method started!!!");
			myMethod();
	
		System.out.println("main method ended!!!");
		
		
	}

	public static void myMethod() 
	{
		System.out.println("myMethod started!!!");
		try {
			int[] numbers = {10,20,30,40};
			
			int res = numbers[4]/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("aithmatic ex occurred");
		}
		catch(Exception e)
		{
			System.out.println("ex occurred");
		}
		
		System.out.println("myMethod ended!!!");
	}

}
