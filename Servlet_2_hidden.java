package com.app.skills;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");

		String skill1=request.getParameter("skill1");
		String skill2=request.getParameter("skill2");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Education Details :</h1><hr>");
		out.println("<form action='s3' method='post'>");
		out.println("Qualification :<input type='text' name='qlf'><br><br>");
		out.println("University :<input type='text' name='univ'><br><br>");
		out.println("<input type='submit' value='Submit'>");
		
		out.println("<input type='hidden' name='firstName' value=" +firstName+">");
		out.println("<input type='hidden' name='lastName' value=" +lastName+">");
		out.println("<input type='hidden' name='skill1' value=" +skill1+">");
		out.println("<input type='hidden' name='skill2' value=" +skill2+">");
		
		out.println("</form>");
		
	}

}
