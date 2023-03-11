package com.prowings.polymorphism.overloading;

public class MainMethodOverloadingDemo {
	
	
	
	 static public void main(String...args) {
		System.out.println("inside original main(String[]) method");
		Integer[] x = {203};
		
		
		main(x);
		
	}
	 static public void main(Integer[] args) {
		 System.out.println("inside original main method");
	 }

	
	
}
