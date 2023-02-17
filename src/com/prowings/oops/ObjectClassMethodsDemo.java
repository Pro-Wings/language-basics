package com.prowings.oops;

public class ObjectClassMethodsDemo {
	
	public static void main(String[] args) {
		
		
		Student std1 = new Student();
		std1.name = "Ram";
		std1.roll = 10;
		std1.address = "Pune";
		
		System.out.println(std1);

		
		Student std2 = new Student();
		std2.name = "Ram";
		std2.roll = 10;
		std2.address = "Mumbai";
		
		System.out.println(std2);

		
		Student std3 = std1;
		
		int hs1 = std1.hashCode();
		int hs2 = std2.hashCode();
		int hs3 = std3.hashCode();
		
		System.out.println(hs1);
		System.out.println(hs2);
		System.out.println(hs3);
		
		System.out.println(">>>>>>>equals demo<<<<<<<<");
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
		System.out.println(std2.equals(std3));
		
		System.out.println(">>>>>>>finalize method demo<<<<<<<<");
		
		std2 = null;
		
		System.gc(); //method to invoke Garbage Collector - it never guarantees the execution!
		
	}

}
