package com.endes;

public class Employee {
	private String name;
	private int employeeYears;
	
	public Employee (String name, int employeeYears) {
		this.name=name;
		this.employeeYears=employeeYears;
	}

	@Override
	public String toString() {
		return "[Name=" + name + ", EmployeeYears=" + employeeYears + "]";
	}
	
	
	
	

}
