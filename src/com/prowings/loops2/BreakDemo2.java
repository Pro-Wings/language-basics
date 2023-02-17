package com.prowings.loops2;

public class BreakDemo2 {
	
	public static void main(String[] args) {
		
	for(int i=1; i<6; i++) // outer for loop
		{
			System.out.println(">>>i : "+i);
			
			for(int j=1; j<6; j++)//inner for loop
			{
				if(j==4)
					break;
				System.out.println("j : "+j);
			}
		}
	}

}
