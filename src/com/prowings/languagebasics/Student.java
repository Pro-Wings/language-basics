package com.prowings.languagebasics;

public class Student {
	
	int id;
	String name;
	
	public Student() //no-arg constructor
	{
		super();
		System.out.println("inside no arg constructor");
	}
	
	public Student(int id, String nm) // parameterized - all arg
	{
		System.out.println("inside all-arg constructor");
		this.id = id;
		this.name = nm;
	}
	
	public Student(int id) //parameterized - 
	{
		this.id = id;
	}
	
	public Student(String name) //parameterized - 
	{
		this.name = name;
	}

	public Student(String nm, int id) // parameterized - all arg
	{
		System.out.println("inside all-arg constructor");
		this.id = id;
		this.name = nm;
	}

	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		std1.id = 10;
		std1.name = "RAM";
		
		System.out.println(std1.id);
		System.out.println(std1.name);

		
		Student std2 = new Student();
		std2.id = 20;
		std2.name = "Sham";

		System.out.println(std2.id);
		System.out.println(std2.name);
		
		Student std3 = new Student();
		std3.id = 30;
		std3.name = "abc";
		
		System.out.println(std3.id);
		System.out.println(std3.name);
		
		//==============================
		
		Student std4 = new Student(40, "PQR");

		System.out.println(std4.id);
		System.out.println(std4.name);
	}

}
