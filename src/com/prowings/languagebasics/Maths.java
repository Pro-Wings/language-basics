package com.prowings.languagebasics;

public class Maths {
	
	public void addition(int a, int b)
	{
		System.out.println("addition method started");
		int result = 0;
		result = a + b;
		System.out.println("addition is : "+result);
		System.out.println("addition method ended");
	}

	
	public void multiplication(int a, int b)
	{
		System.out.println("multiplication method started");
		int result = 0;
		result = a * b;
		System.out.println("multiplication is : "+result);
		System.out.println("multiplication method ended");

	}

	public void division(int a, int b)
	{
		System.out.println("division method started");
		int result = 0;
		try {
			
			result = a / b;
		}
		catch (ArithmeticException e) {
			System.out.println("can not divide by zero!!!");
		}
		System.out.println("division is : "+result);
		System.out.println("division method ended");
	}

	
	public static void main(String[] args) {
		System.out.println("main method started");
		Maths obj = new Maths();
		obj.division(10, 0);
		System.out.println("main method ended");
		
	}
}
