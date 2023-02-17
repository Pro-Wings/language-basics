package com.prowings.polymorphism.overloading;

public class MainMethodOverloadingDemo {
	
	
	int roll;
	String name;
	
	public MainMethodOverloadingDemo()
	{
		
	}
	public MainMethodOverloadingDemo(int roll)
	{
		this.roll = roll;
	}
	public MainMethodOverloadingDemo(String name)
	{
		this.name = name;
	}
	public MainMethodOverloadingDemo(int roll, String name)
	{
		this.name = name;
		this.roll = roll;
	}
	public MainMethodOverloadingDemo(String name, int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	
	
	
	 static public void main(String...args) {
		System.out.println("inside original main(String[]) method");
		Integer[] x = {203};
		
		
		main(x);
		
	}
	 static public void main(Integer[] args) {
		 System.out.println("inside original main method");
	 }

	
	
}
