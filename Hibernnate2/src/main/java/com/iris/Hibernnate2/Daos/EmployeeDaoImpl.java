package com.iris.Hibernnate2.Daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.Hibernnate2.models.Employee;
import com.iris.Hibernnate2.utility.SessionFactoryProviders;


public class EmployeeDaoImpl implements EmployeeDao{

	public boolean addEmployee(Employee e) {
		Session session=SessionFactoryProviders.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e);
		tx.commit();
		session.close();
		
		return true;
		
	}

	public boolean deleteEmployee(int id) {
		Session session=SessionFactoryProviders.getSF().openSession();
		Transaction tx=session.beginTransaction();
		Employee e=session.get(Employee.class,id );
		session.delete(e);
		tx.commit();
		session.close();
		return true;
		
	}

	public boolean updateEmployee(Employee e) {
		Session session=SessionFactoryProviders.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.update(e);
		tx.commit();
		session.close();
		return true;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById(int id) {
		Session session=SessionFactoryProviders.getSF().openSession();
		Employee e=session.get(Employee.class,id);
		session.close();
		
		return e;
	}

}
