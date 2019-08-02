package com.iris.practice.classes;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Employee implements HttpSessionBindingListener {
	private String employeeId;
	private String password;
	private String first_name;
	private String last_name;
	private String gender;
	private String qulalification;
	private String role;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQulalification() {
		return qulalification;
	}
	public void setQulalification(String qulalification) {
		this.qulalification = qulalification;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + ", qulalification=" + qulalification + ", role="
				+ role + "]";
	}
	
	public void valueBound(HttpSessionBindingEvent event)
	{
		Employee obj=(Employee)event.getValue();
		String s=obj.getGender();
		if(s.equals('M'))
		{
			obj.setGender(s.concat("ale"));
		}
		
		
	
		
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}