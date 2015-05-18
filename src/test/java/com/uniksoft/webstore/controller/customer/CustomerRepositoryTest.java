package com.uniksoft.webstore.controller.customer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.uniksoft.webstore.entity.Customer;
import com.uniksoft.webstore.repository.CustomerRepository;
import com.uniksoft.webstore.repository.InMemoryCustomer;

public class CustomerRepositoryTest {

	private CustomerRepository customerRepository;
	
	@Before
	public void setUp() {
		customerRepository = new InMemoryCustomer();
	}
	
	@Test
	public void testGetAllCustomers() {
		//given
		List<Customer> expectedCustomerList = new ArrayList<Customer>();
		expectedCustomerList.add(new Customer("C1", "Pierre", "address1", 1));
		expectedCustomerList.add(new Customer("C2", "Karo", "address2", 2));
		customerRepository.setCustomers(expectedCustomerList);
		//when
		List<Customer> actualCustomerList = customerRepository.getAllCustomers();
		//then
		assertNotNull(actualCustomerList);
		assertSame(expectedCustomerList, actualCustomerList);
	}
}
