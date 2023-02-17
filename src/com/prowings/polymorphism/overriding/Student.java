package com.prowings.polymorphism.overriding;

public class Student {
	
//	 StringBuffer toString() //compiletime error as method is not overriden properly
//	{
//		return new StringBuffer("THis is student class's object");
//	}

	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println(s1.toString());
		
	}
}
