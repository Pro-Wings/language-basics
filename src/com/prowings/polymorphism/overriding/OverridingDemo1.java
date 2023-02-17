package com.prowings.polymorphism.overriding;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;

class Parent
{
	public Number m1() throws IOException
	{
		System.out.println("inside parent m1()");
		
		System.out.println("Hello!!!");
		return null;
	}
}

public class OverridingDemo1 extends Parent{
	
	public Integer m1() throws FileNotFoundException
	{
		System.out.println("inside child m1()");
		
		System.out.println("Hii!!!");
		return 0;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Parent p1 = new Parent();
//		Parent p1 = new OverridingDemo1();
		
		p1.m1();
		
	}

}
