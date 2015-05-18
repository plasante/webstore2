package com.uniksoft.webstore.controller.order;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.uniksoft.webstore.controller.OrderController;
import com.uniksoft.webstore.service.OrderService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class OrderControllerTest {

	private MockMvc mockMvc;
	
	@Mock
	private OrderService mockedOrderService;
	
	@InjectMocks
	private OrderController orderController;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(orderController).build();
	}
	
	@Test
	public void testSanityOrderController() throws Exception {
		mockMvc.perform(get("/order/P1234/2"))
			   .andExpect(status().isMovedTemporarily())
			   .andExpect(view().name("redirect:/products"));
	}
}
