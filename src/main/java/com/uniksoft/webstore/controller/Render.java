package com.uniksoft.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Render {

	@RequestMapping("/render")
	public String render() {
		return "chapter3/render";
	}
}
