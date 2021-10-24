package com.app.skills;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");

		String skill1=request.getParameter("skill1");
		String skill2=request.getParameter("skill2");
		
		String qualification=request.getParameter("qlf");
		String university=request.getParameter("univ");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Details Summary :</h1>");
		out.println("<p>First Name : " +firstName +"</p>");
		out.println("<p>Last Name : " +lastName +"</p>");
		out.println("<p>Skill-1 : " +skill1 +"</p>");
		out.println("<p>Skill-2 : " +skill2 +"</p>");
		out.println("<p>Qualification : " +qualification +"</p>");
		out.println("<p>University : " +university +"</p>");
		
		out.close();
		
	}

}
