package com.vinayak.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vinayak.model.Product;


public interface ProductDao {
	public boolean addProduct(Product obj);
	public List<Product> getAllProducts();
	public boolean updateProduct(Product prod);
	public boolean deleteProduct(String productId);
	public Product getProduct(String productId);

}
