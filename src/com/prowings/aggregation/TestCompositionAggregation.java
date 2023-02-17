package com.prowings.aggregation;

public class TestCompositionAggregation {
	
	public static void main(String[] args) {
		
		StudentId id = new StudentId(10, 987654321);
		Address address = new Address("Pune", "India", 1234);
		
		Student2 std1 = new Student2(id, "Ram", 78.5f, address);
		
		System.out.println(std1);
	}

}
