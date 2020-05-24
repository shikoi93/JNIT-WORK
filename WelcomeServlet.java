package com.hello;

import java.io.*;


import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String username=request.getParameter("user");
	String password=request.getParameter("pass");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");


	PrintWriter pw=response.getWriter();
	pw.println("<html><body bgcolor='wheat'>");
	pw.println("<center><h1>Welcome "+username+"with "+email+" and "+phone+"</h1></center>");
	pw.println("</body></html>");
	
	}

}