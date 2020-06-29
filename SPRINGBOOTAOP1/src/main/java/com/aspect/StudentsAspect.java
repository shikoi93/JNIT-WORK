package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentsAspect {


@Before(value = "execution(* com.service.StudentService.*(..)) && args(sid,name,college)")
public void beforeAdvice(int sid, String name, String college) {
	System.out.println("Before method:");

	System.out.println("Creating student with id: " + sid + " ,name:" + name + " and College: " + college);
}

	@After(value = "execution(* com.service.StudentService.*(..)) && args(sid,name,college)")
	public void afterAdvice(int sid, String name, String college) {
		System.out.println("After method:");

		System.out.println("Created student with id: " + sid + " ,name:" + name + " and College: " + college);
	}
}
