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

public class DispatcherServlet8 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		//application 범위에 객체 가져오기
		ServletContext sc = requset.getServletContext();
		Counter applicationCounter = (Counter)sc.getAttribute("applicationcounter");
		if(applicationCounter != null) {			
			applicationCounter.setValue(applicationCounter.getValue() + 1);
			System.out.println("applicationcounter: " + applicationCounter.getValue());
		}
		
		//session 범위에 객체 가져오기
		HttpSession session = requset.getSession();
		Counter sessionCounter = (Counter)session.getAttribute("sessioncounter");
		if(sessionCounter != null) {
			sessionCounter.setValue(sessionCounter.getValue() + 1);
			System.out.println("sessioncounter: " + sessionCounter.getValue());
		}
		
		
		//request 범위에 객체 가져오기
			Counter requsetCounter = (Counter)requset.getAttribute("requestcounter");
			if(requsetCounter != null) {
				requsetCounter.setValue(requsetCounter.getValue() + 1);
				System.out.println("requestcounter: " + requsetCounter.getValue());
			}
			
		
		
		//forward
		RequestDispatcher rd = requset.getRequestDispatcher("WEB-INF/view/dispatcher8.jsp");
		rd.forward(requset, response);
		
		
	}
}
