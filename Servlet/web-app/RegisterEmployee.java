package com.employeeR;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegister
 */
public class RegisterEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con=null;
       PreparedStatement ps=null;
       
       public void init(ServletConfig config) {
    	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String url = "jdbc:mysql://localhost:3306/university";
    	String username = "root";
		String password = "root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

       }
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		long mobile=Long.parseLong(phone);

		try {
			ps=con.prepareStatement("insert into employee(username,password,email,phone,department) value(?,?,?,?,?)");
			//ps.setString(1,"st.nextval");
			ps.setString(1,user);
			ps.setString(2,pass);
			ps.setString(3,email);
			ps.setString(4,phone);
			ps.setString(5,department);
			int x=ps.executeUpdate();
			PrintWriter pw=response.getWriter();
			
			//PrintWriter pw=response.getWriter();
			if(x!=0) {
				response.sendRedirect("./employee_loginform.jsp");
				
				/*
				pw.println("<html><bgcolor='wheat'>");
				pw.println("<center><h1> "+user+",you have been registered as employee.Congratulations!!");
				pw.println("</h1></center></body></html>");
				*/
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
