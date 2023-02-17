package com.prowings.loops2;

public class BreakDemo {
	

	public static void main(String[] args) {
		
	System.out.println(">>>>>>>>for - break<<<<<<<");	
		for(int i=1; i<6; i++)
		{
			if(i==4)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println(">>>>>>>>while - break<<<<<<<");	
		
		int i = 1;
		while(i<6)
		{
			if(i==4)
				break;
			System.out.println(i);	
			i++;
		}	
	}
}
