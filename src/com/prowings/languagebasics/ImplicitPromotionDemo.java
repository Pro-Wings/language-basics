package com.prowings.languagebasics;

public class ImplicitPromotionDemo {
	
	public static void main(String[] args) {
		
		byte b = 127;
		
		
		short s = b;//converted byte into short - implicitly
		
		System.out.println("b = "+b);
		System.out.println("s = "+s);
		
		
		short s1 = 138;
		
		byte b1 = (byte) s1; //explicitly converted larger dt into smaller one
		
		System.out.println("s1 = "+s1);
		System.out.println("b1 = "+b1);

		
		long l = 123492834798724L;
		int i = (int) l;
		float f = i;
		double d = f;

		System.out.println("l = "+l);
		System.out.println("i = "+i);
		System.out.println("f = "+f);
		System.out.println("d = "+d);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int j = 7116253;
		char c = (char) j;
		
		
		System.out.println("j = "+j);
		System.out.println("c= "+c);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

		char x = 'a';
		
		byte y = (byte) x;
		System.out.println("y= "+y);
	}

}
