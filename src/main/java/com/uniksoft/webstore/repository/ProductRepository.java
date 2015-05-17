package com.uniksoft.webstore.repository;

import java.util.List;

import com.uniksoft.webstore.entity.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	Product getProductById(String productID);
}
