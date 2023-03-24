package com.prowings.constructor;

public class Student {
	
	int roll;
	String name;
	String address;
	
	public Student() // no-arg constructor
	{
		System.out.println("inside no arg constructor!!");
	}
	

	public Student(int rno, String nm)
	{
		this(nm, rno, "Mumbai");
		System.out.println("student(int rno, String nm) -- invoked");
	}
	
	public Student(String name, int roll, String address)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		System.out.println("student(String nm, int rno, String add) -- invoked");

	}
	
	public static void main(String[] args) {
		
		
		Student s2 = new Student(30, "ABC");

		

	}

}
