package com.mycompany.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet4 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		//How1
		/*resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h4>DisoatcherServlet34</h4>");
		out.println("		응답 내용");
		out.println("	</body>");
		out.println("</html>");*/
		
		//How2
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/dispatcher4.jsp");
		rd.forward(req, rep);
		
		
	}
}
