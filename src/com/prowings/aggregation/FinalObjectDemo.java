package com.prowings.aggregation;

public class FinalObjectDemo {
	
	public static void main(String[] args) {
		
		final int i = 10; //final with primitive - value fixed
		System.out.println("i before change : "+i);
//		i = 30;
		System.out.println("i after change : "+i);
		
		final Integer j = 20;
		System.out.println("j before change : "+j);
//		j = 30;
		System.out.println("j after change : "+j);

		final StudentPOJO std = new StudentPOJO(10, "Ram", 78.5f);
		
		System.out.println("Before change in std : " +std);
		
		std.setName("Sham");
		std.setMarks(98.8f);
		std.setRoll(30);
		
		System.out.println("After change in std : " +std);
		
		StudentPOJO std1 = new StudentPOJO();
		
//		std = std1;
	}

}
