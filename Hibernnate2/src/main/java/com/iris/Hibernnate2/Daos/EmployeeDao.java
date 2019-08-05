package com.iris.Hibernnate2.Daos;

import java.util.List;

import com.iris.Hibernnate2.models.Employee;


public interface EmployeeDao {

	
	public boolean addEmployee(Employee m);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee e);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployee();
	
}
