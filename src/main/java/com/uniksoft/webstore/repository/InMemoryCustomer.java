package com.uniksoft.webstore.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uniksoft.webstore.entity.Customer;

@Repository
public class InMemoryCustomer implements CustomerRepository {

	private List<Customer> customers = new ArrayList<Customer>();
	
	public InMemoryCustomer() {
		Customer customer1 = new Customer("C1", "Pierre", "address", 2);
		Customer customer2 = new Customer("C2", "Karo", "address", 3);
		Customer customer3 = new Customer("C3", "Juby", "address", 4);
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
	}
	
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}

}
