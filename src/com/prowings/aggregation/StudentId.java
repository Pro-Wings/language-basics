package com.prowings.aggregation;

public class StudentId {
	
	int roll;
	long mobileNumber;
	
	public StudentId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentId(int roll, long mobileNumber) {
		super();
		this.roll = roll;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "StudentId [roll=" + roll + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
