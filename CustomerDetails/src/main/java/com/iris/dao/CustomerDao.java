package com.iris.dao;

import com.iris.models.Customer;

public interface CustomerDao {

	
	public boolean addCustomer(Customer c);
	public Customer getCustomerById(String email);
	
}
