package com.prowings.polymorphism.overloading;

public class OverloadingDemo7 {

	public static void test(int[] intArr) {
		System.out.println("int array");
	}

//	public static void test(int... intArr) {
//		System.out.println("int array");
//	}

	public static void test(long[] longArr) {
		System.out.println("long array");
	}

	public static void test(char[] charArr) {
		System.out.println("char array");
	}

	public static void test(Object o) {
		System.out.println("Object o");
	}

	
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		test(nums);
//		 test(null);
	}

}
