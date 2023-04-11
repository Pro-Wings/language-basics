package com.prowings.practice;

public class Department {
	
	int did;
	String name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String name) {
		super();
		this.did = did;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + "]";
	}
	
	

}
