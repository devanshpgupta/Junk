package com.demo.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	
	public String execute() {
		
		if(new Date().getSeconds() %2 == 0)
			return SUCCESS;
		else
			return ERROR;
	}

}
