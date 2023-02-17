package com.prowings.polymorphism.overriding;

import java.sql.SQLException;

public class TestException3 {
	
	public static void main(String[] args)  throws SQLException
	{
	
		try {
			throw new StackOverflowError();
		}catch (Throwable e) {
			System.out.println("Error occured!!");
		}
		
	}
}
