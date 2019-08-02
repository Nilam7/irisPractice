package com.portal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public boolean register(Employee emp) {
		try (
		Connection conn=ConnectionProvider.getDBConnection();
		){
		PreparedStatement ps=conn.prepareStatement("insert into ETab values(emptabseq.nextval,?,?,?,?)");
		ps.setString(1,emp.getEmployeeName());
		ps.setString(2,emp.getGender());
		ps.setString(3,emp.getQualification());
		ps.setString(4,emp.getEmailAddress());
		
		int i=ps.executeUpdate();
		if(i!=0){
			ps=conn.prepareStatement("insert into LTab values(emptabseq.currval,?,'Employee')");
			ps.setString(1,emp.getPassword());
			ps.executeUpdate();
			return true;
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public Employee validate(String empid, String pass) {
		
		System.out.println("I am inside validate");
		try (Connection conn=ConnectionProvider.getDBConnection();){
		PreparedStatement ps=conn.prepareStatement("select Eid,Ename,Gender,Qualification,Email,Role from ETab join LTab using(Eid) where Eid=? and Password=?");
		ps.setString(1,empid);
		ps.setString(2,pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			System.out.println("I m inside  if : "+rs.getString(2));
			
			//if user is valid
			String name=rs.getString(2);
			String gender=rs.getString(3);
			String q=rs.getString(4);
			String email=rs.getString(5);
			String role=rs.getString(6);
			
			Employee emp=new Employee();
			emp.setEmployeeId(empid);
			emp.setEmployeeName(name);
			emp.setGender(gender);
			emp.setEmailAddress(email);
			emp.setQualification(q);
			emp.setRole(role);
			
			return emp;
			
			
		}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> eList=new ArrayList<>();
		
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("select Eid,Ename,Gender,Qualification,Email,Role from ETab join LTab using(Eid)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				//if user is valid
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String q=rs.getString(4);
				
				String email=rs.getString(5);
				String role=rs.getString(6);
				
				Employee emp=new Employee();
				emp.setEmployeeId(rs.getString(1));
				emp.setEmployeeName(name);
				emp.setGender(gender);
				emp.setEmailAddress(email);
				emp.setQualification(q);
				
				emp.setRole(role);
				
				eList.add(emp);
				
				
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return eList;

	}

}

