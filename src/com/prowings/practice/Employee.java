package com.prowings.practice;

public class Employee {
	
	int id;
	String name;
	Department dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	
	public Employee(Employee e) //copy constructor
	{
		this.id = e.id;
		this.name = e.name;

		//		this.dept = e.dept;
		
		Department copyDept = new Department();
		copyDept.did = e.dept.did;
		copyDept.name = e.dept.name;
		
		this.dept = copyDept;

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
