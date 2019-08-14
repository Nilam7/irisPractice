package com.iris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
import com.vinayak.model.Product;


@Controller
public class ProductController {
	
	
	
	@Autowired
	CategoryDao categorydao;
	
	@Autowired
	ProductDao productdao;
	
	@RequestMapping(value="/addProduct",method=RequestMethod.GET)
	public String getProductForm(ModelMap map){
		
		System.out.print("I m in add product");
		map.addAttribute("pObj",new Product());
		map.addAttribute("frmLabel","Add Product Form");
		map.addAttribute("btnLabel","Add Product");
		map.addAttribute("categories",categorydao.getAllCategories());
		return "ProductForm";
	}


	@RequestMapping(value="/submitProduct",method=RequestMethod.POST)
	public String submitProduct(@ModelAttribute Product pObj,ModelMap map){
		System.out.println(pObj.getProductName());
		System.out.println(pObj.getProdesc());
		System.out.println(pObj.getCat());
		
		productdao.addProduct(pObj);
		
		map.addAttribute("msg","Product Added Succesfully");
		map.addAttribute("products",productdao.getAllProducts());
		return "ViewProducts";
	}
	
	@RequestMapping(value="/deleteProduct/{productId}",method=RequestMethod.GET)
	public String deleteProduct(@PathVariable String productId,ModelMap map){
		//categorydao.deleteCategory(catId);
		productdao.deleteProduct(productId);
		map.addAttribute("msg","Product Deleted Succesfully");
		List<Product> productList=productdao.getAllProducts();
		map.addAttribute("products",productList);
		return "ViewProducts";
	
}
	@RequestMapping(value="/viewpro",method=RequestMethod.GET)
	public String viewpro(ModelMap map)
	{
		List<Product> productList=productdao.getAllProducts();
		
		map.addAttribute("products",productList);
		return "ViewProducts";
	}
	
	@RequestMapping(value="/updateProduct/{productId}",method=RequestMethod.GET)
	public String updateProductForm(@PathVariable String productId,ModelMap map){
		
		Product pObj=productdao.getProduct(productId);
		map.addAttribute("pObj",pObj);
		map.addAttribute("btnLabel","Update Category");
		map.addAttribute("frmLabel","Update Category Form");
		map.addAttribute("categories",categorydao.getAllCategories());
		
		return "ProductForm";
	
	}
}
	
