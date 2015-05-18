package com.uniksoft.webstore.controller.customer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uniksoft.webstore.entity.Customer;
import com.uniksoft.webstore.repository.CustomerRepository;
import com.uniksoft.webstore.service.DefaultCustomerService;

public class CustomerServiceTest {

	@Mock
	private CustomerRepository mockedCustomerRepository;
	
	@InjectMocks
	private DefaultCustomerService customerService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllCustomers() {
		//given
		List<Customer> fakeCustomers = new ArrayList<Customer>();
		fakeCustomers.add(new Customer());
		fakeCustomers.add(new Customer());
		//when
		when(mockedCustomerRepository.getAllCustomers()).thenReturn(fakeCustomers);
		List<Customer> actualCustomers = customerService.getAllCustomers();
		//then
		assertNotNull(actualCustomers);
		assertSame(fakeCustomers, actualCustomers);
	}
}
