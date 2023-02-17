package com.prowings.aggregation;

public class Student2 {
	// Association - 2 types : composition and aggregation
	
	StudentId id; //composition :  StudentId class  can not exist without class Student2 – but class Student2 can exist without class StudentId.
	String name;
	float marks;
	Address address; //aggregation : the existence of class Student2 and Address are not dependent on each other.
	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(StudentId id, String name, float marks, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
}
