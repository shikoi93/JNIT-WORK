package com.mvcbeanjava;

import java.sql.SQLException;

public class LoginMvcBean {
private String username,password;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean validate() throws ClassNotFoundException, SQLException {
	DatabaseMvcBean dm=new DatabaseMvcBean();
	boolean status=dm.getResult(username,password);
	if(status==true)
		return true;
	else 
		return false;
	
    }  
}
