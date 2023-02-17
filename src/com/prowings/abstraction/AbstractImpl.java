package com.prowings.abstraction;

public class AbstractImpl extends AbstractClassDemo{

	@Override
	public void print() {
		
		System.out.println("inside print method!!");
		
	}


	public static void main(String[] args) {
		
		
		AbstractImpl obj = new AbstractImpl();
		
		obj.printHello();
		obj.print();
		
	}
	
}
