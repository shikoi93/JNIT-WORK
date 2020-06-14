package com.employeeconstructor;

public class Employee {

	private int id;
	private String name;
	private String department;
	public Employee() {
		System.out.println("default constructor");
	}
	
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public void show() {
		System.out.println(id+"   "+name+"   "+department);
		
	}
}
