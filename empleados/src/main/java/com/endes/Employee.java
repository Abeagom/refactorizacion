package com.endes;

public class Employee {
	private String name;
	private int employeeYears;
	
	public Employee (String name, int employeeYears) {
		this.name=name;
		this.employeeYears=employeeYears;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeYears() {
		return employeeYears;
	}

	public void setEmployeeYears(int employeeYears) {
		this.employeeYears = employeeYears;
	}

	@Override
	public String toString() {
		return "[Name=" + name + ", EmployeeYears=" + employeeYears + "]";
	}
	
	
	
	

}
