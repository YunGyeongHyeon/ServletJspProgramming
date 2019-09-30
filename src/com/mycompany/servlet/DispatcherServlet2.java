package com.mycompany.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet2 extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		String contextConfigLocation = config.getInitParameter("contextConfigLocation");
		System.out.println("contextConfigLocation: " + contextConfigLocation);
		System.out.println("네네. "+contextConfigLocation + "이 경로에 있는 파일을 읽고 적용을 하겠습니다.");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rsp) {
		System.out.println("DispatcherServlet2 service run........");
	}
}
