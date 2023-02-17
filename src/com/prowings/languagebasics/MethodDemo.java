package com.prowings.languagebasics;

public class MethodDemo {

	static
	{
		System.out.println("inside static block 22!!!");
	}
	
	static
	{
		System.out.println("inside static block 11!!!");
	}
	
	
	{
		System.out.println("inside instance block 2!!!");
	}



	{
		System.out.println("inside instance block 1!!!");
	}


	public MethodDemo()
	{
		super();
		System.out.println("inside no-arg constructor!!!");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("inside main method!!!");
		
		MethodDemo obj = new MethodDemo();
		obj.additionOfTwoNumbers(30, 40);

		MethodDemo obj2 = new MethodDemo();
		
	}
	
	 public  void additionOfTwoNumbers(int a, int b)
	 {
		 int res = a + b;

		 System.out.println(res);
		 
	 }

	
}
