package com.chitkara.oops;

public class Question {

}

class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;

	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public void calculateNetSalary(int pfpercentage) {
		netSalary = salary - (salary * pfpercentage / 100);
		System.out.println(netSalary);
	}

//	static int getPFPercentage() {
//
//	}

	/*
	 * public static Employee getEmployeeDetails() - which gets the employee details
	 * - id, name and salary from the user and returns the employee object. public
	 * static int getPFPercentage() - which gets the PF percentage and returns the
	 * same
	 */

	public static Employee getEmployeeDetails(int id, String name, double salary) {
		return new Employee(id, name, salary);
	}

}

class Main3 {
	public static void main(String[] args) {
		Employee.getEmployeeDetails(7, "Thala", 100000);
//		System.out.println(Employee.getEmployeeDetails(7, "Thala", 100000).toString());

		Employee emp = new Employee(5, "Amaon", 50000);

		emp.calculateNetSalary(10);

	}

}