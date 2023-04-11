package com.prowings.practice;

public class TestClone {
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(1234, "Pune");
	
		Student s1 = new Student(10, "Ram", address);
		
		Student s2 = (Student) s1.clone();
		
	
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(">>>>>>>>after change in address");
		
		s1.address.city = "Mumbai";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
		System.out.println(s1.address == s2.address);
		
	}

}
