package com.prowings.polymorphism.overriding;

import java.sql.SQLException;

public class TestException {
	
	public static void main(String[] args)  throws SQLException
	{
		
		System.out.println("main method started!!!");
			
		myMethod();
			
		System.out.println("main method ended!!!");
		
		
	}

	public static void myMethod()  throws SQLException
	{
		System.out.println("myMethod started!!!");
		
		anotherMethod();
		
		System.out.println("myMethod ended!!!");
	}

	private static void anotherMethod() throws SQLException
	{
		System.out.println("anotherMethod started!!!");

			String name = null;
			int res = name.length();
			System.out.println("Result is : "+res);
			
		System.out.println("anotherMethod ended!!!");
	}

}
