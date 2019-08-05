package com.iris.Hibernnate2.practice;

import com.iris.Hibernnate2.Daos.EmployeeDao;
import com.iris.Hibernnate2.Daos.EmployeeDaoImpl;
import com.iris.Hibernnate2.models.Employee;

public class App {

	
	public static void main(String...args)
	{
		/*Employee e=new Employee();
		e.setId(1);
		e.setName("SAGAR");
		e.setRole("GET");
		EmployeeDao dobj=new EmployeeDaoImpl();
		boolean r=dobj.addEmployee(e);
		if(r)
		{
			System.out.print("Record Inserted");
		}
		else
		{
			System.out.print("something went wrong");
		}*/
		
		
		EmployeeDao dobj=new EmployeeDaoImpl();
		Employee e=dobj.getEmployeeById(5);
		e.setName("Rounak");
		
		
		dobj.updateEmployee(e);
	}
}
	
		
		