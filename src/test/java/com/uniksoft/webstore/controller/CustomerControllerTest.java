package com.uniksoft.webstore.controller;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.uniksoft.webstore.entity.Customer;
import com.uniksoft.webstore.service.CustomerService;

public class CustomerControllerTest {

	private MockMvc mockMvc;
	
	@Mock
	private CustomerService mockedCustomerService;
	
	@InjectMocks
	private CustomerController customerController;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
	}
	
	@Test
	public void testIndex() throws Exception {
		//given
		List<Customer> fakeCustomerList = new ArrayList<Customer>();
		fakeCustomerList.add(new Customer());
		fakeCustomerList.add(new Customer());
		//when
		when(mockedCustomerService.getAllCustomers()).thenReturn(fakeCustomerList);
		//then
		mockMvc.perform(get("/customers"))
		       .andExpect(status().isOk())
		       .andExpect(model().attribute("customers", hasSize(fakeCustomerList.size())))
		       .andExpect(view().name("customer"));
	}
}
