package com.prowings.abstraction;

public class AnnonymusObjectCreation {
	
	
	public static void main(String[] args) {
		
		
		A a = new A() {
			
			@Override
			public void m1() {
				System.out.println("m1");
				
			}
		};
		
	}

}
