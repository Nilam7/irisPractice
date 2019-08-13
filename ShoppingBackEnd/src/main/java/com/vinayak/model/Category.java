package com.vinayak.model;

import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Entity
public class Category {
	
	@Id
	private String categoryId;
	private String categoryName;
	private String description;
	
	@OneToMany(mappedBy="cat")
	private List<Product> prod;
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProd() {
		return prod;
	}
	public void setProd(List<Product> prod) {
		this.prod = prod;
	}
	
	
}
