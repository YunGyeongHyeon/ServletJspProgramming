package com.mycompany.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		System.out.println("DispatcherServlet6 doGet 실행");
		String title = req.getParameter("title"); 
		String content =  req.getParameter("content");
	
		req.setAttribute("title", title);
		req.setAttribute("content", content);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(req, rep);		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		System.out.println("DispatcherServlet6 doPost 실행");
	
		
		String title = req.getParameter("title"); 
		String content =  req.getParameter("content");
	
		req.setAttribute("title", title);
		req.setAttribute("content", content);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(req, rep);
		
		
	}
}
