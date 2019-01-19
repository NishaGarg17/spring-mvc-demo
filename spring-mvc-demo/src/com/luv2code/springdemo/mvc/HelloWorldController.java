package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//Need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	//Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//new controller method to read form data and
	//to add data to Model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		//convert the data to all caps
		theName = theName.toUpperCase();
		//create the message
		String result = "Yo! " + theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
}
