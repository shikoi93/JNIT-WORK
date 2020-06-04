package com.mvcbeanjava;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 public class LoginMvcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	LoginMvcBean lb=new LoginMvcBean();
	lb.setUsername(username);
	lb.setPassword(password);
	HttpSession hs=request.getSession();
	hs.setAttribute("bean",lb);
	try {
		boolean status=lb.validate();
		if(status==true)
		{
			response.sendRedirect("./success.jsp?msg=Success");
		}
		else
		{
			response.sendRedirect("./fail.jsp?msg=Failed");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	

}
