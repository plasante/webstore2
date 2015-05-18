package com.uniksoft.webstore.guava.loadingCache;

import com.google.common.base.MoreObjects;

public class Employee {
	
	private String name;
	private String dept;
	private String empID;
	
	public Employee(String name, String dept, String empID) {
		super();
		this.name = name;
		this.dept = dept;
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	public String toString() {
		return MoreObjects.toStringHelper(Employee.class)
				.add("Name", name)
				.add("Department", dept)
				.add("Emp Id", empID).toString();
	}
}
