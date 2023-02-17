package com.prowings.polymorphism.overloading;

public class OverloadingDemo1 {
	
	public void m1()
	{
		System.out.println("inside m1() ");
	}
	public int m1(int b)
	{
		System.out.println("inside m1(int b) ");
		return 20;
	}
	public void m1(long a)
	{
		System.out.println("inside m1(long a) ");
	}
	public void m1(Integer a)
	{
		System.out.println("inside m1(Integer a) ");
	}
	public void m1(Long a)
	{
		System.out.println("inside m1(Long a) ");
	}

}
