package com.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;
import com.demo.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String loadLoginForm(Map model) {
		
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		
		return "loginform";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLogin(Map model, @Valid LoginForm loginForm, BindingResult result) {
		String view = "error";
		LoginService service = new LoginService();
		//System.out.println(loginForm.getUsername() + ":" + loginForm.getPassword());
		
		if(result.hasErrors()) {
			return "loginform";
		}
		
		else if(service.isUserExists(loginForm.getUsername(), loginForm.getPassword())) {
				view = "welcome";
		}
		
		return view;
	}

}
