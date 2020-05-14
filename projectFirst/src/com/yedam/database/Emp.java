package com.yedam.database;

public class Emp {
	private int employeeId;
	private String lastName;
	private int salary;
	private String hireDate;
	public Emp(String lastName, String hireDate) {
		this.lastName = lastName;
		this.hireDate = hireDate;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void showInfo() {
		System.out.println("사원번호" + employeeId + "성" + lastName + "급여" + salary +
				           "입사일" + hireDate);
	}

	
}
