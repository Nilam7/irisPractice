package com.portal.entities;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;

//POJO
public class Employee {
	
	private String employeeId;
	private String employeeName;
	private String gender;
	private String qualification;
	private String emailAddress;
	private String password;
	private String role;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String empid) {
		this.employeeId = empid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}