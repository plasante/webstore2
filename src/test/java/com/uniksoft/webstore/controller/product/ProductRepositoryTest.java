package com.uniksoft.webstore.controller.product;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.uniksoft.webstore.entity.Product;
import com.uniksoft.webstore.repository.InMemoryProduct;
import com.uniksoft.webstore.repository.ProductRepository;

public class ProductRepositoryTest {

	private ProductRepository productRepository;
	
	@Before
	public void setUp() {
		productRepository = new InMemoryProduct();
	}
	
	@Test
	public void testGetAllProductsByCategory() {
		//given
		List<Product> actual = new ArrayList<Product>();
		Product laptopCategory = new Product(); laptopCategory.setCategory("laptop");
		Product iphoneCategory = new Product(); iphoneCategory.setCategory("iphone");
		Product tabletCategory = new Product(); tabletCategory.setCategory("tablet");
		actual.add(laptopCategory);
		actual.add(iphoneCategory);
		actual.add(tabletCategory);
		//when
		List<Product> expected = productRepository.getProductsByCategory("laptop");
		//then
		assertNotNull(expected);
		assertEquals(expected.size(), 1);
	}
}
