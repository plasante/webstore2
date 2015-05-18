package com.uniksoft.webstore.controller.product;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uniksoft.webstore.entity.Product;
import com.uniksoft.webstore.repository.ProductRepository;
import com.uniksoft.webstore.service.DefaultProductService;

public class ProductServiceTest {

	@Mock
	private ProductRepository mockedProductRepository;
	
	@InjectMocks
	private DefaultProductService productService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetProductsByCategory() {
		//given
		List<Product> fakeProducts = new ArrayList<Product>();
		Product product1 = new Product(); product1.setCategory("laptop");
		Product product2 = new Product(); product2.setCategory("laptop");
		fakeProducts.add(product1);
		fakeProducts.add(product2);
		//when
		when(mockedProductRepository.getProductsByCategory("laptop")).thenReturn(fakeProducts);
		List<Product> actualProducts = productService.getProductsByCategory("laptop");
		//then
		assertEquals(actualProducts.size(), 2);
		assertSame(fakeProducts, actualProducts);
	}
}
