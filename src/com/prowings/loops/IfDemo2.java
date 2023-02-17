package com.prowings.loops;

public class IfDemo2 {
	
	public static void main(String[] args) {
		System.out.println("main method started");

		
		System.out.println(isEvenOrOdd(1));
		
		
		System.out.println("main method ended");
		
	}
		
	public static String isEvenOrOddUsingTernary(int number)
	{
		return (number%2==0) ? "even" : "odd";
	}

	public static String isEvenOrOdd(int number)
	{
		if(number%2 == 0)
		{
			return "even";
		}
		else 
		{
			return "odd";
		}
	}

	
}
