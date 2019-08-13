package com.vinayak.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vinayak.model.Product;

@Repository
public interface ProductDao {
	public boolean addProduct(Product obj);
	public List<Product> getAllProducts();

}
