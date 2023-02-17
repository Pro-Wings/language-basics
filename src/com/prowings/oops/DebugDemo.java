package com.prowings.oops;

import java.util.Scanner;

public class DebugDemo {

	public DebugDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		System.out.println("Enter two numbers : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = addition(a, b);
		System.out.println("Addition of entered numbers is : "+res);

		printEvenNumbers();
		System.out.println("main method ended!!");
		
	}

	public static int addition(int a, int b) {
		System.out.println("addition method started!!");
		int result = a + b;
		System.out.println("addition method ended!!");
		return result;
	}

	public static void printEvenNumbers()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i + " is Even Number");
			}
		}
	}
	
}
