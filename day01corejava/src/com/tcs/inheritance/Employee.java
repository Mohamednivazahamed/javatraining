package com.tcs.inheritance;

public class Employee {
	private int empid;
	private String name;
	private String location;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", location=" + location + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
