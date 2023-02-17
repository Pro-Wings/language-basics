package com.prowings.polymorphism.overloading;

public class OverloadingDemo8 {
	
	public void m1()
	{
		System.out.println("inside m1() ");
	}
//	public int m1(int b)
//	{
//		System.out.println("inside m1(int b) ");
//		return 20;
//	}
//	public void m1(long a)
//	{
//		System.out.println("inside m1(long a) ");
//	}
//	public void m1(Integer a)
//	{
//		System.out.println("inside m1(Integer a) ");
//	}
	public void m1(Long a)
	{
		System.out.println("inside m1(Long a) ");
	}
//	public void m1(Object a)
//	{
//		System.out.println("inside m1(Object a) ");
//	}
//	public void m1(Number a)
//	{
//		System.out.println("inside m1(Number a) ");
//	}

	public static void main(String[] args) {
		
		OverloadingDemo8 obj = new OverloadingDemo8();
		
//		obj.m1(10);
		
	}
	
}
