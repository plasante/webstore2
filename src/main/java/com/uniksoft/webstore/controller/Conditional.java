package com.uniksoft.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Conditional {

	@RequestMapping("/conditional")
	public String conditional() {
		return "chapter3/index";
	}
}