package com.iris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.CategoryDaoImpl;
import com.vinayak.model.Category;

@Controller
public class Control {

	@Autowired
	private CategoryDao categorydao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String myHomepage()
	{
		return "HomePage";
	}
	
	
	@RequestMapping(value="/Add",method=RequestMethod.GET)
	public ModelAndView addCategory()
	{
		Category c=new Category();
		ModelAndView mv=new ModelAndView("AddCategory");
		mv.addObject("cObj",c);
		mv.addObject("btnLabel","Add Category");
		mv.addObject("frmLabel","Add Category Form");
		return mv;
		
	}
	@RequestMapping(value="/show",method=RequestMethod.POST)
	public String viewModel(@ModelAttribute Category cObj,ModelMap map)
	{
		System.out.println("I m in show method");
		//if(cObj.getCategoryId()==null){
			categorydao.addCategory(cObj);
			map.addAttribute("msg","Category Added Succesfully");
		//}
		
		List<Category> categoryList=categorydao.getAllCategories();
		map.addAttribute("categories",categoryList);
		return "view";
		
		
	}
	@RequestMapping(value="/viewall",method=RequestMethod.GET)
	public String viewall(ModelMap map)
	{
		List<Category> categoryList=categorydao.getAllCategories();
		
		map.addAttribute("categories",categoryList);
		return "view";
	}
	@RequestMapping(value="/deleteCategory/{catId}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable String catId,ModelMap map){
		
		try
		{
		categorydao.deleteCategory(catId);
		map.addAttribute("msg","Category Deleted Succesfully");
		List<Category> categoryList=categorydao.getAllCategories();
		map.addAttribute("categories",categoryList);
		return "view";
		}
		catch(Exception e)
		{
			return "error";
		}
	
}
	
	@RequestMapping(value="/updateCategory/{catId}",method=RequestMethod.GET)
	public String updateCategoryForm(@PathVariable String catId,ModelMap map){
		Category cObj=categorydao.getCategory(catId);
		map.addAttribute("cObj",cObj);
		map.addAttribute("btnLabel","Update Category");
		map.addAttribute("frmLabel","Update Category Form");
		
		return "AddCategory";
	
	}
	@RequestMapping(value="/deleteUpdate/{catId}",method=RequestMethod.GET)
	public String updateDeleteCategory(@PathVariable String catId,ModelMap map)
	{
		categorydao.deleteCategory(catId);
		List<Category> categoryList=categorydao.getAllCategories();
		map.addAttribute("lists",categoryList);
		return "view";
	}
}
