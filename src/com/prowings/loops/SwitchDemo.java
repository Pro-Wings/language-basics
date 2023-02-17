package com.prowings.loops;

import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter the size of Tshirt : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input)
		{
		case 28 :
			System.out.println("Size is Small");
			break;
		
		case 32 :
			System.out.println("Size is Medium");
			break;
		
		case 42 :
			System.out.println("Size is Large");
			break;
			
		default :
			System.out.println("Invalid size!!");
		}
		
		
		
		
	}

}
