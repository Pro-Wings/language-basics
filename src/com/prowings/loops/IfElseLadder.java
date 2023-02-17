package com.prowings.loops;

public class IfElseLadder {
	
	public static void main(String[] args) {
		
		System.out.println("Grade is : "+gradeResolver(140) );
		
	}

	private static String gradeResolver(int marks) {

		if(marks < 50)
		{
			return "Fail";
		}
		else if(marks >= 50 && marks <= 60)
		{
			return "B Grade";
		}
		else if(marks > 60 && marks <= 70)
		{
			return "A Grade";
		}
		else if(marks > 70 && marks <= 100) 
		{
			return "first class with distinction!!";
		}
		else
		{
			return "Invalid marks!!";
		}
	}

}
