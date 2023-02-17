package com.prowings.loops2;

public class ContinueDemo {
	

	public static void main(String[] args) {
		
	System.out.println(">>>>>>>>for - continue<<<<<<<");	
		for(int i=1; i<6; i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println("i : "+i);
		}
		
		
		System.out.println(">>>>>>>>while - continue<<<<<<<");	
		
		int i = 1;
		while(i<6)
		{
			if(i==4)
			{
				i++;
				continue;
			}
			System.out.println("i's value is : "+i);
			
			i++;
		}	
	}
}
