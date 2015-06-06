package com.uniksoft.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chapter2 {

	@RequestMapping("/chapter2")
	public String index() {
		return "chapter2/index";
	}
}
