package com.luv2code.springdemo.mvc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	@RequestMapping("/showForm")
	public String displatShowForm() {
		return "yeah";
		
	}
}