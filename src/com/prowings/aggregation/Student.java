package com.prowings.aggregation;

public class Student {
	
	private int rollNumber;
	private String name;
	private float marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name, float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public int getRollNumber() //getter method
	{
		return this.rollNumber;
	}
	
	public void setRollNumber(int rollNumber) //setter method
	{
		this.rollNumber = rollNumber;
	}

	public float getMarks()
	{
		float convrtedMarks = this.marks - 10;
		return convrtedMarks;
	}
	
	public void setMarks(float mrks)
	{
		this.marks = mrks;
	}
}
