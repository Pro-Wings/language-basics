package com.prowings.practice;

public class Student implements Cloneable{
	
	int rollNo;
	String name;
	Address address;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		
		Student clonedStudent = (Student) super.clone();
		
		Address clonedAddress = (Address) clonedStudent.address.clone();
		
		clonedStudent.address = clonedAddress;
		
		return clonedStudent;
		
	}
	
	
	
	

}
