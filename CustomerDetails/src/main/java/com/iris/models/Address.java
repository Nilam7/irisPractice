package com.iris.models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private String House_no;
	private String street;
	private String city;
	private String state;
	
	
	public Address()
	{
		
	}
	
	
public Address(String house_no, String street, String city, String state) {
		
		House_no = house_no;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [House_no=" + House_no + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	public String getHouse_no() {
		return House_no;
	}
	public void setHouse_no(String house_no) {
		House_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
