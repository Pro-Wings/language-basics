package com.prowings.practice;

public class TestCopyConstructor {
	
	public static void main(String[] args) {
		
		Department dept = new Department(123, "IT");
		
		Employee emp1 = new Employee(10, "Ram", dept);
		Employee emp2 = new Employee(emp1);
		
		System.out.println(">>>>>>>>after change in dept");
		
		emp1.dept.name = "HR";
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1 == emp2);
		System.out.println(emp1.dept == emp2.dept);
	}

}
