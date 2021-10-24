package com.app.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ss1")
public class Servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		
		Cookie fnameCookie=new Cookie("fname",fname);
		Cookie lnameCookie=new Cookie("lname",lname);
		
		res.addCookie(fnameCookie);
		res.addCookie(lnameCookie);
		PrintWriter out=res.getWriter();
		out.println("<form action='ss2' method='post'>");
		out.println("<h1>Skills Details :</h1><hr>");
		out.println("Skill-1 : <input type='text' name='skill1'><br><br>");
		out.println("Skill-2 : <input type='text' name='skill2'><br><br>");
		out.println("<input type='submit' value='Next'>");
		out.println("</form>");
	}

}
