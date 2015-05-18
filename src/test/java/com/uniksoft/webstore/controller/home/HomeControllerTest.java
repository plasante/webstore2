package com.uniksoft.webstore.controller.home;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.uniksoft.webstore.controller.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
 
public class HomeControllerTest {

	private MockMvc mockMvc;
	
	@InjectMocks
	private HomeController homeController;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
	}
	
	@Test
	public void testHomeController() throws Exception {
		mockMvc.perform(get("/"))
			   .andExpect(status().isOk())
			   .andExpect(model().attribute("greeting", "Welcome to Web Store!"))
			   .andExpect(model().attribute("tagline", "The one and only amazing webstore"))
			   .andExpect(view().name("welcome"));
	}
}
