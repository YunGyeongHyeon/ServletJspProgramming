package com.mycompany.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.dto.Counter;

public class DispatcherServlet7 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		//application 범위에 객체를 저장
		Counter applicationCounter = new Counter();
		ServletContext sc = requset.getServletContext();
		if(sc.getAttribute("applicationcounter")==null) {
			sc.setAttribute("applicationcounter", applicationCounter);
		}
		
		//session 범위에 객체를 저장
		HttpSession session = requset.getSession();
		if(session.getAttribute("sessioncounter") == null) {
			Counter sessionCounter = new Counter();
			session.setAttribute("sessioncounter", sessionCounter);			
		}
		
		
		//request 범위에 객체를 저장
		if(requset.getAttribute("requestcounter") == null) {			
			Counter requestCounter = new Counter();
			requset.setAttribute("requestcounter", requestCounter);
		}
		
		//forward
		RequestDispatcher rd = requset.getRequestDispatcher("/dispatcher8");
		rd.forward(requset, response);
		
		
	}
}
