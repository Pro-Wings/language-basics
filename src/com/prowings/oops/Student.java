package com.prowings.oops;

import java.util.Objects;

public class Student implements Cloneable {
	
	int roll;
	String name;
	String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

@Override
	public String toString() {
		return "Student : "+roll+"   "+name+"   "+ address;
	}






@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@Override
protected void finalize() throws Throwable {
	System.out.println("finalize method invoked for Student object!!");
	super.finalize();
}

public static void main(String[] args) throws Throwable {
	
	Student std1 = new Student(10, "Ram", "Pune");
	
	System.out.println("Std1 : "+std1);
	
	Student std2 = (Student) std1.clone();
	
	System.out.println("Std2 : "+std2);
	
}
	

}
