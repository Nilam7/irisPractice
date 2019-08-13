package com.vinayak.ShoppingBackEnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

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
    	
    	 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
         
         CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
         ProductDao objp=context.getBean("productDao",ProductDao.class);
         Category c=null;
         Product p=null;
    	Scanner sc=new Scanner(System.in);
    	int choice;
    	System.out.print("Enter 1 to add product\nEnter 2 to add categories\n Enter 3 to view Products\n Enter 4 to view Categories");
    	choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    			 p=new Product();
    			System.out.print("Enter Product id\n");
    			p.setProductId(sc.next());
    			System.out.print("Enter Product NAME\n");
    			p.setProductName(sc.next());
    			System.out.print("Enter Product description\n");
    			p.setProdesc(sc.next());
    			System.out.print("Enter Category id\n");
    				p.setCat(c);
    				 objp.addProduct(p);
    				 System.out.print("Product added");
    				
    				break;
    			
    			
    	
    	case 2:
    		
    				 c=new Category();
    				System.out.print("Enter the Category id\n");
    				c.setCategoryId(sc.next());
    				System.out.print("Enter the Category name\n");
    				c.setCategoryName(sc.next());
    				System.out.print("Enter the Category desc\n");
    					c.setDescription(sc.next());
    					
    					obj.addCategory(c);
    					System.out.print("Category added");
    				break;
    				
    	case 3:
    			System.out.print("List of all the products");
    			
    			 List<Product> prods=objp.getAllProducts();
    		        for(Product pObj:prods) {
    		        	System.out.println(pObj.getProductId()+" "+pObj.getProductName()+" "+pObj.getProdesc());
    		        }
    		        break;
    	
    	
    	case 4:
    		
    		System.out.print("List of all the categories");
    		
    		
    		List<Category> categories=obj.getAllCategories();
    	       for(Category cObj:categories) {
    	       	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName()+" "+cObj.getDescription());
    	       }
    	       break;
    	       
    	     default:
    	    	 System.exit(0);
    	    	 
    	    	 
    	}
    		
    	//System.out.println("enter category or product");
    	//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    	// String name = reader.readLine();
    	// if(name.equals("category")) {
    	//Category c=new Category();
    //	System.out.println("enter add or view");
    	//c.setCategoryId("3");
    	//c.setCategoryName("women footwear");
    	//c.setDescription(" chappal");
    	
    	//Product p=new Product();
    	//p.setProductId("P3");
    	//p.setProductName("shorts");
    	//p.setProdesc(" Trouser");
    	
       
        
       // obj.addCategory(c);
       // System.out.println("Category Added");
        
       // objp.addProduct(p);
      //  System.out.println("Product Added");
        
      //  List<Category> categories=obj.getAllCategories();
       // for(Category cObj:categories) {
        //	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName());
       // }
        
        //List<Product> prods=objp.getAllProducts();
        //for(Product pObj:prods) {
        	//System.out.println(pObj.getProductId()+" "+pObj.getProductName());
       // }
        
        
    	 }
    }
    


