package com.ustglobal.webappp.servlet;

import javax.servlet.http.HttpServlet;

public class Employee  extends HttpServlet {
	
	public int id;
	public String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
