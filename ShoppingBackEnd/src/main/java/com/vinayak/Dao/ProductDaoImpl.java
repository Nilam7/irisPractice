package com.vinayak.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinayak.model.Product;

	@Component
	@Repository(value="productDao")
	@Transactional
	public class ProductDaoImpl implements ProductDao{

		@Autowired
		private SessionFactory sessionFactory;
		public boolean addProduct(Product obj)
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
		public List<Product> getAllProducts() {

			try
			{
				Session session=sessionFactory.getCurrentSession(); //hibernate
				Query q=session.createQuery("from Product");
				return q.list();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
	
		public boolean updateProduct(Product prod) {
			try
			{
				Session session=sessionFactory.getCurrentSession();
				session.saveOrUpdate(prod);
				
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;
		}
		
		public boolean deleteProduct(String productId) {
			try
			{
				Session session=sessionFactory.getCurrentSession();
				Product p=new Product();
				p.setProductId(productId);
				session.delete(p);
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;
		}
		
		public Product getProduct(String productId) {
			try
			{
				Session session=sessionFactory.getCurrentSession();
				Product p=session.get(Product.class, productId);
				
				return p;
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}

	}


