package com.tecsup.gestion.model;

public class Employee {

	String login;
	String password;
	int employeeId;
	String firstname;
	String lastname;
	int salary;
	int departmentId;

	
	/**
	 * 
	 * @param login
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @param salary
	 * @param departmentId
	 */

	public Employee(String login, String password, int employeeId, String firstname, String lastname, int salary,
			int departmentId) {
		super();
		this.login = login;
		this.password = password;
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.departmentId = departmentId;
	}

	public Employee() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeID) {
		this.employeeId = employeeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [login=" + login + ", password=" + password + ", employeeId=" + employeeId + ", firstname="
				+ firstname + ", lastname=" + lastname + ", salary=" + salary + ", departmentId=" + departmentId + "]";
	}

}
