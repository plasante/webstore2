package com.uniksoft.webstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniksoft.webstore.entity.Product;
import com.uniksoft.webstore.repository.ProductRepository;

@Service
public class DefaultProductService implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

}
