package com.prowings.practice.immutable;

public class TestImmutability {
	
	public static void main(String[] args) {
		
		Address add = new Address(123, "INDIA");
		
		Person p1 = new Person(10, "Rma", add);
		
		System.out.println(p1);

		System.out.println("<<<<<<<<<after changing the person>>>>>>>>>>");
		
		add.setCountry("US");
		
		p1.getAddr().setCountry("DUBAI");
		
		System.out.println(p1);

	}

}
