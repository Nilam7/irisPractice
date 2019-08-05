package com.iris.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Product {

	@Id
	//@GeneratedValue
	private int pid;
	private String pname;
	private String pprice;
	private String pdescrition;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPrice(String price) {
		this.pprice = price;
	}
	public String getPdescrition() {
		return pdescrition;
	}
	public void setPdescrition(String pdescrition) {
		this.pdescrition = pdescrition;
	}
}
