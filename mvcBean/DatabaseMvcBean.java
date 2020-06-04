package com.mvcbeanjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMvcBean {
	public boolean getResult(String username,String password) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/university";
		String user = "root";
		String pass = "root";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement ps=con.prepareStatement("select * from employee where username=? and password=?");
		
		ps.setString(1,username);
		ps.setString(2,password);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) 
		{
			return true;
		} 
		else 
		{
			return false;
			
		}
	}
	
		
}


