package com.vinayak.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vinayak.model.Category;

@Repository
public interface CategoryDao  {

		public boolean addCategory(Category obj);
		public List<Category> getAllCategories();
		public boolean deleteCategory(String categoryId);
		public boolean updateCategory(Category obj);
		public Category getCategory(String categoryId);
}
