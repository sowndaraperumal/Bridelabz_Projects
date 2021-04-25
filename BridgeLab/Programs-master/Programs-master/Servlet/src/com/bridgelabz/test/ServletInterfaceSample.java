package com.bridgelabz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterfaceSample implements Servlet {
public static void main(String[] args) {
	
}

private ServletConfig config;

@Override
public void destroy() {
	System.out.println("servlet is destory");
	
}

@Override
public ServletConfig getServletConfig() {
	
	return config;
}

@Override
public String getServletInfo() {
	
	return "copyright 2007-1010";
}

@Override
public void init(ServletConfig config) throws ServletException {
this.config=config;	
}

@Override
public void service(ServletRequest request, ServletResponse  response) throws ServletException, IOException {
response.setContentType("text/html");
	PrintWriter printWriter=response.getWriter();
	printWriter.print("<html><boby>");
	printWriter.print("<h1>sowndar</h1>");
	printWriter.print("</boby></html>");
}
}
