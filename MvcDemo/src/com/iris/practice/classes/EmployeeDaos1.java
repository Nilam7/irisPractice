package com.iris.practice.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.iris.practice.interfaces.Employeedaos;

public class EmployeeDaos1 implements Employeedaos {
	public Employee Validate(String Employeeid,String Password)
	{
		try(Connection conn= ConnectionProvider.getDbConnection() )
		{
			PreparedStatement ps=conn.prepareStatement("select * from Employee where EmployeeId=? and Password=?");
			ps.setString(1,Employeeid);
			ps.setString(2,Password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				
				
				String fname=rs.getString(3);
				String gender=rs.getString(5);
				String q=rs.getString(6);
				String role=rs.getString(7);
				
				
				//
				Employee obj=new Employee();
				obj.setEmployeeId(Employeeid);
				 obj.setFirst_name(fname);
				obj.setGender(gender);
				
				obj.setQulalification(q);
				
				obj.setRole(role);
				
				
				
				
				return obj;
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
		}

	@Override
	public boolean Register(Employee obj) {
		try (
				Connection conn=ConnectionProvider.getDbConnection();
				){
				PreparedStatement ps=conn.prepareStatement("insert into Employee values(empid.nextval,'Admin',?,?,?,?,'Employee')");
				ps.setString(1,obj.getFirst_name());
				ps.setString(2,obj.getLast_name());
				ps.setString(3,obj.getGender());
				ps.setString(4,obj.getQulalification());
				int i=ps.executeUpdate();
				if(i!=0)
				{
					return true;
				}
				
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return false;
		
	}

	@Override
	public Employee getEmployeeById(String Employeeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int Employeeid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
List<Employee> eList=new ArrayList<>();
		
		try (Connection conn=ConnectionProvider.getDbConnection();){
			PreparedStatement ps=conn.prepareStatement("select * from Employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				//if user is valid
				String id=rs.getString(1);
				String pass=rs.getString(2);
				String fname=rs.getString(3);
				String lname=rs.getString(4);
				
				String gender=rs.getString(5);
				String q=rs.getString(6);
				String role=rs.getString(7);
				
				Employee obj=new Employee();
				obj.setEmployeeId(id);
				obj.setPassword(pass);
				obj.setFirst_name(fname);
				obj.setLast_name(lname);
				obj.setGender(gender);
				obj.setQulalification(q);
				obj.setRole(role);
				
				eList.add(obj);
				
				
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return eList;

	}





}


