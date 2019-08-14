package com.vinayak.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinayak.model.Category;

@Component
@Repository(value="categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	private SessionFactory sessionFactory;
	public boolean addCategory(Category obj)
	{
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			session.saveOrUpdate(obj);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public List<Category> getAllCategories() {

		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			Query q=session.createQuery("from Category");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public boolean deleteCategory(String categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category c=new Category();
			c.setCategoryId(categoryId);
			session.delete(c);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updateCategory(Category obj) {
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			session.update(obj);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public Category getCategory(String categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category c=session.get(Category.class, categoryId);
			return c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean updateDelete(String categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("delete from Product where cat.categoryId=:cId");
			query.setParameter("cId", categoryId);
			int i=query.executeUpdate();
			if(i!=0)
			{
				Category c=session.get(Category.class, categoryId);
				session.delete(c);
			}
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	

}
