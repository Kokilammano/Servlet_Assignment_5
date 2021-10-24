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
 * Servlet implementation class Servlet_2
 */
@WebServlet("/ss2")
public class Servlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String skill1=req.getParameter("skill1");
		String skill2=req.getParameter("skill2");
		
		Cookie skill1Cookie=new Cookie("skill1",skill1);
		Cookie skill2Cookie=new Cookie("skill2",skill2);
		
		res.addCookie(skill1Cookie);
		res.addCookie(skill2Cookie);
		
		PrintWriter out=res.getWriter();
		out.println("<h1>Education Details :</h1><hr>");
		out.println("<form action='ss3' method='post'>");
		out.println("Qualification :<input type='text' name='qlf'><br><br>");
		out.println("University :<input type='text' name='univ'><br><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
	}

}
