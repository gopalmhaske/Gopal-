package com.example.service;

import java.util.List;

import com.example.model.Category;
import com.example.model.Product;

public interface ProductService {
	
List<Product> getAllProduct();
	
	Product createProduct(Product product);
	
	Product getProductById(int id);
	
	Product updateProductById(Product product, int id);
	
	void deleteProduct(int id);
	

}
