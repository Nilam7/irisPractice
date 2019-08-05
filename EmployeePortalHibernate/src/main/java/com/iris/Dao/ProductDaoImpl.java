package com.iris.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.Product;
import com.iris.utilities.SessionFactoryProvider;

public class ProductDaoImpl implements ProductDao{

	public boolean addProduct(Product p) {
		try
		{
			Session session=SessionFactoryProvider.getSf().openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(p);
			tx.commit();
			session.close();
			return true;
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return false;
	}

	public List<Product> getAllProduct() {
		try
		{
			Session session=SessionFactoryProvider.getSf().openSession();
			Query query=session.createQuery("from Product");
			
			List<Product> prolist=query.list();
			return prolist;
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteProduct(Product p) {
		Session session=SessionFactoryProvider.getSf().openSession();
		Transaction tx=session.beginTransaction();
		session.delete(p);
		tx.commit();
		session.close();
		
		return true;
		
		
	}

	public boolean UpdateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
