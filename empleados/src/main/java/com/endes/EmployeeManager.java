package com.endes;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<Employee> employees = new ArrayList<Employee>();
    
    public void addEmployee(Employee e) {
        if (employees.size()< 10) {
        	employees.add(e);
            System.out.println(e + " added to the system.");
        } else {
            System.out.println("Cannot add more employees, system is full.");
        }
    }
    
    @Override
	public String toString() {
		return "List of employees: " + employees;
	}
}
