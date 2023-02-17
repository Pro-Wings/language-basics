package com.prowings.scenarios;

class X {
	
	public void m1()
	{
		System.out.println("m1 of X");
	}

}
class Y extends X {
	
	public void m1(int i)
	{
		System.out.println("m1(int) of Y");
	}
	
}

public class TestSc1
{
	public static void main(String[] args) {
		
		Y y = new Y();
		y.m1();
		y.m1(10);
		
		
	}
}