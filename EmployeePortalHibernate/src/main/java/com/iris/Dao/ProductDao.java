package com.iris.Dao;

import java.util.List;

import com.iris.models.Product;

public interface ProductDao {

	
	public boolean addProduct(Product p);
	public List<Product> getAllProduct();
	public boolean deleteProduct(Product p);
	public boolean UpdateProduct(Product p);
	public Product getProductById(int pid);
	
	
}
