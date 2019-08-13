package com.vinayak.ShoppingBackEnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
import com.vinayak.model.Product;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//System.out.println("enter category or product");
    	//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    	// String name = reader.readLine();
    	// if(name.equals("category")) {
    	Category c=new Category();
    	System.out.println("enter add or view");
    	c.setCategoryId("2");
    	c.setCategoryName("women Wear");
    	c.setDescription(" Casual Wear");
    	
    	Product p=new Product();
    	p.setProductId("P2");
    	p.setProductName("pants");
    	p.setProdesc("Formal  Trouser");
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
        ProductDao objp=context.getBean("productDao",ProductDao.class);
        
        obj.addCategory(c);
        System.out.println("Category Added");
        
        objp.addProduct(p);
        System.out.println("Product Added");
        
        List<Category> categories=obj.getAllCategories();
        for(Category cObj:categories) {
        	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName());
        }
        
        List<Product> prods=objp.getAllProducts();
        for(Product pObj:prods) {
        	System.out.println(pObj.getProductId()+" "+pObj.getProductName());
        }
        
        
    	 }
    }
    


