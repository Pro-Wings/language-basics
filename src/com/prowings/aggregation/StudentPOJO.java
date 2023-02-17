package com.prowings.aggregation;

public class StudentPOJO{
	
	private int roll;
	private String name;
	private float marks;
	
	
	
	public StudentPOJO(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public StudentPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoll() //getter method
	{
		return this.roll;
	}
	
	public void setRoll(int roll) //setter method
	{
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentPOJO [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
}
