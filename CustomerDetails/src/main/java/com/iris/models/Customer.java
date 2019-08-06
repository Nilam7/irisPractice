package com.iris.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Customer {

	
	@Id
	private String email;
	private String name;
	private String contact_no;
	
	@ElementCollection
	Set<Address> addresses=new HashSet<Address>();
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", contact_no=" + contact_no + ", addresses=" + addresses
				+ "]";
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Customer(String email, String name, String contact_no, Set<Address> addresses) {
	
		this.email = email;
		this.name = name;
		this.contact_no = contact_no;
		this.addresses = addresses;
	}
	public Customer()
	{
	}
	
}