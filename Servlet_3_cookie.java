package com.app.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_3
 */
@WebServlet("/ss3")
public class Servlet_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		Cookie[] cookies=req.getCookies();
		String fname=cookies[0].getValue();
		String lname=cookies[1].getValue();
		String skill1=cookies[2].getValue();
		String skill2=cookies[3].getValue();
		
		String qlf=req.getParameter("qlf");
		String univ=req.getParameter("univ");
		
		PrintWriter out=res.getWriter();
		
		out.println("<h1>Details Summary :</h1><hr>");
		out.println("<p>First Name : " +fname +"</p>");
		out.println("<p>Last Name : " +lname +"</p>");
		out.println("<p>Skill-1 : " +skill1 +"</p>");
		out.println("<p>Skill-2 : " +skill2 +"</p>");
		out.println("<p>Qualification : " +qlf +"</p>");
		out.println("<p>University : " +univ +"</p>");
		
		out.close();
	}

}
