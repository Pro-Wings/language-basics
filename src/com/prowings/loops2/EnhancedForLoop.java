package com.prowings.loops2;

public class EnhancedForLoop {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70};
		
		for(int n : numbers)
		{
			System.out.println(n);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		String[] words = {"hello", "hi", "abc", "pqr", "xyz"};
		
		for(int i=2; i<words.length-1; i++)
		{
			System.out.println(words[i]);
		}
		
		System.out.println("==== for-each loop ====");

		for(String word : words)
		{
			System.out.println(word);
		}
		
	}

}
