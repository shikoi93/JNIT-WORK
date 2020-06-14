package com.autowire;

public class Categories {
	private String name;
	private Car cr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*
	public Car getCr() {
		return cr;
	}
	public void setCr(Car cr) {
		this.cr = cr;
	}
*/
	public Categories(Car cr) {
		this.cr = cr;
	}
	
public void carDetail() {
	System.out.println("Category name="+name);
	System.out.println("Car name = "+cr.getCarname()+  "Car Price = "+cr.getCarprice());
	
}
}
