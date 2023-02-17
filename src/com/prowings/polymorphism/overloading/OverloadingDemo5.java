package com.prowings.polymorphism.overloading;

public class OverloadingDemo5 {
	

	public void m1(int i, int j)
	{
		System.out.println("inside m1(int int)");
	}

//	public void m1(long i, long j)
//	{
//		System.out.println("inside m1(long long)");
//	}

	public void m1(Integer i, long j)
	{
		System.out.println("inside m1(Integer long)");
	}

	
	
	public static void main(String[] args) {
		
		OverloadingDemo5 obj = new OverloadingDemo5();
		
		int a = 10, b=20;
		long x = 40l, y= 50l;
		
		obj.m1(a, y); //int long
		
	}
	
}
