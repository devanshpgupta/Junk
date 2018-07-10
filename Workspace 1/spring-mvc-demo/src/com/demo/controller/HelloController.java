package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("simpleHello")
	public ModelAndView sayHello() {
		
		String message = "Welcome to Spring MVC!";
		
		ModelAndView modelAndView = new ModelAndView("hello", "myMessage", message);
		
		return modelAndView;
	}

}
