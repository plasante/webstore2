package com.uniksoft.webstore.quava.listToMap;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class TransformListToMap {

	@Test
	public void transform_list_to_map() {
		List<Product> products = Lists.newArrayList();
		products.add(new Product("1","laptop","a laptop"));
		products.add(new Product("2","iphone","a iphone"));
		products.add(new Product("3","tablet","a tablet"));
		
		ImmutableMap<String, Product> productMap = 
				Maps.uniqueIndex(products, 
						new Function<Product, String>() {
							public String apply(Product input) {
								return input.getName();
							}
						});
		System.out.println(productMap);
		System.out.println(productMap.get("laptop").getDescription());
	}
	
}
