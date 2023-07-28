package com.example.service;

import java.util.List;

import com.example.model.Category;

public interface CategoryService {

	List<Category> getAllCategory();
	
	Category createCategory(Category category);
	
	Category getCategoryById(int id);
	
	Category updateCategoryById(Category category, int id);
	
	void deleteCategory(int id);
	
	
	
}
