package com.prowings.languagebasics;

import java.util.Scanner;

public class EvenNumber {
	
	
	public static boolean isEven(int n)
	{
		boolean res;
		
		res = n%2 == 0;
		
		return res;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number : ");
		
		int input = sc.nextInt();
		
		boolean result = isEven(input);
		
		System.out.println("is Even number : "+result);
		
	}

}
