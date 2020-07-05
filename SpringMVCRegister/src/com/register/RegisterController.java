package com.register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	
	@RequestMapping("register")
	public String register(HttpServletRequest request, HttpServletResponse response) {
	String id=request.getParameter("Id");
	String username=request.getParameter("Username");
	String password=request.getParameter("Password");
	String email=request.getParameter("Email");
	String phone=request.getParameter("Phone");
	
	request.setAttribute("Id", id);
	request.setAttribute("Username", username);
	request.setAttribute("Email", email);
	request.setAttribute("Phone", phone);
	
	return "display.jsp";


	}

}
