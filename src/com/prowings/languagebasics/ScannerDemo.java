package com.prowings.languagebasics;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a String : ");
		
		String input = sc.next();
		
		System.out.println("Entered string is :" +input);
		
	}

}
