package com.prowings.languagebasics;

public class Employee {
	
	int id; //instance variable
	String name;
	int pin;
	String address;
	String country;
	
	
	
	public Employee(int id, int n)
	{
		this.id = id;
		this.pin = n;
	}

	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1234, 10);
		System.out.println(emp.id);
		System.out.println(emp.pin);
		
	}
}
