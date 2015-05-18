package com.uniksoft.webstore.controller.product;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.uniksoft.webstore.controller.ProductController;
import com.uniksoft.webstore.entity.Product;
import com.uniksoft.webstore.service.ProductService;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class ProductControllerTest {

	private MockMvc mockMvc;
	
	@Mock
	private ProductService mockedProductService;
	
	@InjectMocks
	private ProductController productController;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
	}
	
	@Test
	public void testHttpGetProductController() throws Exception {
		mockMvc.perform(get("/products"))
		       .andExpect(status().isOk())
		       .andExpect(view().name("product"));
	}
	
	@Test
	public void testProductRepository() throws Exception {
		List<Product> fakeProducts = new ArrayList<Product>();
		fakeProducts.add(new Product());
		fakeProducts.add(new Product());
		
		when(mockedProductService.getAllProducts()).thenReturn(fakeProducts);
		
		mockMvc.perform(get("/products"))
		       .andExpect(status().isOk())
		       .andExpect(model().attribute("products", hasSize(fakeProducts.size())))
		       .andExpect(view().name("product"));
	}
	
	@Test
	public void testMappingProductsCategory() throws Exception {
		List<Product> fakeProducts = new ArrayList<Product>();
		Product product1 = new Product(); product1.setCategory("laptop");
		Product product2 = new Product(); product2.setCategory("laptop");
		
		when(mockedProductService.getProductsByCategory("laptop")).thenReturn(fakeProducts);
		
		mockMvc.perform(get("/products/laptop"))
		       .andExpect(status().isOk())
		       .andExpect(model().attribute("products", hasSize(fakeProducts.size())))
		       .andExpect(view().name("product"));
	}
}
