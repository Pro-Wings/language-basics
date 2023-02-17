package com.prowings.oops;

public class MethodExtractShortcutDemo {

	public MethodExtractShortcutDemo() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("AAAAA");
		sum(a, b);

		System.out.println("BBBBB");
		
		sum(a, b);
		
		System.out.println("CCCCC");
		sum(a, b);
		
		System.out.println("DDDDD");

		sum(a, b);
		
		
	}


	public static void sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);
		System.out.println("hello");
	}
}
