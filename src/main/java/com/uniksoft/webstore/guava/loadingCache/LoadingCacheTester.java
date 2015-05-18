package com.uniksoft.webstore.guava.loadingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hibernate.bytecode.buildtime.spi.ExecutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class LoadingCacheTester {

	public static void main(String[] args) throws java.util.concurrent.ExecutionException {
		LoadingCache<String, Employee> employeeCache =
			CacheBuilder.newBuilder()
						.maximumSize(100)
						.expireAfterAccess(30, TimeUnit.MINUTES)
						.build(new CacheLoader<String, Employee>() {
							@Override
							public Employee load(String empId) throws Exception {
								return getFromDatabase(empId);
							}
						});
		try {
			System.out.println("Invocation #1");
			System.out.println(employeeCache.get("100"));
			System.out.println(employeeCache.get("103"));
			System.out.println(employeeCache.get("110"));
			
			System.out.println("Invocation #2");
			System.out.println(employeeCache.get("100"));
			System.out.println(employeeCache.get("103"));
			System.out.println(employeeCache.get("110"));
			
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
					
	}

	private static Employee getFromDatabase(String empId) {
		
		Employee e1 = new Employee("Pierre","Finance","100");
		Employee e2 = new Employee("Karo","IT","103");
		Employee e3 = new Employee("Juby","Admin","110");
		
		Map<String, Employee> database = new HashMap<String, Employee>();
		
		database.put("100", e1);
		database.put("103", e2);
		database.put("110", e3);
		
		System.out.println("Database hit for " + empId);
		
		return database.get(empId);
	}
}
