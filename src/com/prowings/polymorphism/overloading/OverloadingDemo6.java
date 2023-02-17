package com.prowings.polymorphism.overloading;

public class OverloadingDemo6 {
	

//	public int m1(int n)
//	{
//		System.out.println("inside m1(int b) ");
//		System.out.println(n);
//		return 20;
//	}
//	public void m1(long a)
//	{
//		System.out.println("inside m1(long a) ");
//	}

	public void m1(int...a)
	{
		System.out.println("inside m1(int...a) ");
	}

//	public void m1(char a)
//	{
//		System.out.println("inside m1(cahr a) ");
//	}

	
	public static void main(String[] args) {
		
		OverloadingDemo6 obj = new OverloadingDemo6();
		char c = 'a';
		obj.m1(c);
		
	}
}
