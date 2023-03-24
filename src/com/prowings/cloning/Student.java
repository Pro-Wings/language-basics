package com.prowings.cloning;

public class Student implements Cloneable{
	
	int roll;
	String name;
	String address;
	
	public Student() // no-arg constructor
	{
		System.out.println("inside no arg constructor!!");
	}
	
	public Student(String name, int roll, String address)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		System.out.println("student(String nm, int rno, String add) -- invoked");

	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student("Ram", 10, "Pune");

		//Student s2 = new Student("Ram", 10, "Pune");
		
		Student s2 = (Student) s1.clone();
		
		System.out.println("S1 : "+ s1);
		System.out.println("S2 : "+ s2);

	}

}
