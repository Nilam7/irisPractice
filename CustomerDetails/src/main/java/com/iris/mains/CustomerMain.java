package com.iris.mains;

import java.util.HashSet;
import java.util.Set;

import com.iris.dao.CustomerDao;
import com.iris.dao.CustomerDaoImpl;
import com.iris.models.Address;
import com.iris.models.Customer;

public class CustomerMain {

	
	public static void main(String...args)
	{
		Address add1=new Address("65","AdarshNagar","Ranchi","Jharkhand");
		Address add2=new Address ("135","Duplex Villa","Noida","UP");
		Set<Address> address=new HashSet<Address>();
		address.add(add1);
		address.add(add2);
		
		Customer c=new Customer("sagar@gmail.com","sagar","8617736997",address);
		CustomerDao jobj=new CustomerDaoImpl();
		boolean obj=jobj.addCustomer(c);
		
		
		Customer ob=jobj.getCustomerById("sagar@gmail.com");
		if(ob!=null)
		{
			System.out.print(ob.toString());
		}
		
		
		
	}
}
