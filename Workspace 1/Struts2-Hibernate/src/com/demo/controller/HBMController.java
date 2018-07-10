package com.demo.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.demo.model.*;
import com.opensymphony.xwork2.ActionSupport;

public class HBMController extends ActionSupport implements ServletRequestAware, ApplicationAware {
	MyOperations ma = new MyOperations();
	List<employee> list = null;
	employee e;
	Map m;

	@Override
	public void setApplication(Map arg0) {
		// TODO Auto-generated method stub
		this.m = arg0;
	}

	HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

	public String getRecords() {
		list = ma.retriveRecords();
		request.setAttribute("rec", list);
		return SUCCESS;
	}

	public String editRecords() {
		System.out.println("Inside Here");
		String x = request.getParameter("id");
		System.out.println(x);
		list = ma.retriveRecords(x);
		e = list.get(0);
		m.put("a", e.getId());
		m.put("b", e.getFname());
		m.put("c", e.getLname());
		m.put("d", e.getPassword());
		m.put("e", e.getSalary());
		m.put("f", e.getTelno());
		m.put("g", e.getRole());
		return SUCCESS;
	}

	public String updaterec() {
		ma.updaterecord(e);
		return SUCCESS;
	}

}
