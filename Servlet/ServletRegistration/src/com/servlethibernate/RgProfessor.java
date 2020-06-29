package com.servlethibernate;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RgProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	SessionFactory sf = null;
	
	public void init(ServletConfig config) {
		
		Configuration cf = new Configuration();
		cf.configure("configure.xml");
		sf = cf.buildSessionFactory();
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String pid=request.getParameter("pid");
	int id=Integer.parseInt(pid);
	String fullName=request.getParameter("fullName");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");
	Long mobile=Long.parseLong(phone);
	String department=request.getParameter("department");
	
	Session se = sf.openSession();
	
	RegisterProfessor r = new RegisterProfessor();
	r.setPid(id);
	r.setFullName(fullName);
	r.setPassword(password);
	r.setEmail(email);
	r.setPhone(mobile);
	r.setDepartment(department);
	
	Transaction tx = se.beginTransaction();
	se.save(r);
	tx.commit();
	se.close();
	
	sf.close();
	response.sendRedirect("./ProfessorLogin.jsp");
	
	
	
}
}

	
	


