package com.uniksoft.webstore.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uniksoft.webstore.entity.Product;

@Repository
public class InMemoryProduct implements ProductRepository {

	private List<Product> products = new ArrayList<Product>();
	
	public InMemoryProduct() {
		Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
		iphone.setDescription("Apple iPhone 5s smartphone");
		iphone.setCategory("SmartPhone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		
		Product laptop_dell = new Product("P1235","Dell Inspiron", new BigDecimal(700));
		laptop_dell.setDescription("Dell Inspiron 14-inch Laptop (Black)");
		laptop_dell.setCategory("Laptop");
		laptop_dell.setManufacturer("Dell");
		laptop_dell.setUnitsInStock(1000);
		
		Product tablet_Nexus = new Product("P1236","Nexus 7", new BigDecimal(300));
		tablet_Nexus.setDescription("Google Nexus 7 quad-core");
		tablet_Nexus.setCategory("Tablet");
		tablet_Nexus.setManufacturer("Google");
		tablet_Nexus.setUnitsInStock(1000);
		
		products.add(iphone);
		products.add(tablet_Nexus);
		products.add(laptop_dell);
	}
	
	@Override
	public List<Product> getAllProducts() {
		return products;
	}

	@Override
	public Product getProductById(String productID) {
		Product productById = null;
		for (Product product : products) {
			if (product != null && product.getProductId() != null && product.getProductId().equals(productID)) {
				productById = product;
				break;
			}
		}
		if (productById == null) {
			throw new IllegalArgumentException("No products found with the product id: " + productID);
		}
		return productById;
	}

}
