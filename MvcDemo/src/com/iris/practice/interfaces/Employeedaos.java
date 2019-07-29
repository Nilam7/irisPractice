package com.iris.practice.interfaces;

import java.util.List;

import com.iris.practice.classes.Employee;

public interface Employeedaos {
	public Employee Validate(String Employeeid,String Password);
	public boolean Register(Employee obj);
	public Employee getEmployeeById(String Employeeid);
	public boolean updateEmployee(Employee obj);
	public boolean deleteEmployee(int Employeeid);
	public List<Employee> getAllEmployee();
	


}
