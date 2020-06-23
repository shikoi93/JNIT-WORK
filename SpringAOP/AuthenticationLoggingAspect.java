package com.ex;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//combination of both AuthenticationAspect and loggingAspect.

public class AuthenticationLoggingAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Authentication Done.");
		Object ob=m.proceed();
		System.out.println("Logging Information Stored.");
		return ob;
	}

}
