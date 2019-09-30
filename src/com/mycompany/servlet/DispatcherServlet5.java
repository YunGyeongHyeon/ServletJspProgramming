package com.mycompany.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet5 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		String name = req.getParameter("name"); 
		String age =  req.getParameter("age");
		int intAge = Integer.parseInt(age);
	
		req.setAttribute("name", name);
		req.setAttribute("age", intAge);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/dispatcher5.jsp");
		rd.forward(req, rep);
		
		
	}
}
