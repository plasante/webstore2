package com.uniksoft.webstore.service;

import java.util.List;

import com.uniksoft.webstore.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
}
