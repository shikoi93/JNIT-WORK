package com.check;

import org.springframework.aop.ThrowsAdvice;

public class AuthenticationAspect implements ThrowsAdvice {
	public void afterThrowing(NullPointerException e) {
		System.out.println("Null Value.");
		
	}

}
