package com.iris.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.Customer;
import com.iris.utilities.SessionFactoryProvider;

public class CustomerDaoImpl implements CustomerDao {

	public boolean addCustomer(Customer c) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			return false;
	}

	public Customer getCustomerById(String email) {
		
		try
		{
		Session session=SessionFactoryProvider.getSF().openSession();
		Customer obj=session.get(Customer.class, email);
		return obj;
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
