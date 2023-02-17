package com.prowings.loops;

public class IfDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!!");


		if(isValidVoter(18))
		{
			System.out.println("Voter is valid!!");
		}
		else
		{
			System.out.println("voter is not valid!!");
		}
		
		System.out.println("main method ended!!!");
	}


	public static boolean isEven(int number)
	{
		if(number%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isValidVoter(int age)
	{
		if(age >= 18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
