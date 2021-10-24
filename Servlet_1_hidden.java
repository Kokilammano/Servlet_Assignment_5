package com.app.skills;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		PrintWriter out=response.getWriter();
		out.println("<h1>Skills Details :</h1><hr>");
		out.println("<form action='s2' method='post'>");
		out.println("Skill-1 : <input type='text' name='skill1'><br><br>");
		out.println("Skill-2 : <input type='text' name='skill2'><br><br>");
		
		out.println("<input type='hidden' name='firstName' value="+firstName+">");
		out.println("<input type='hidden' name='lastName' value="+lastName+">");
		
		out.println("<input type='submit' value='Next'>");
		out.println("</form>");
		
	}

}
