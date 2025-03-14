package com.walmart.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

	@Pointcut("execution(* com.walmart.controller..*(..))")
	public void doOperation() {
	}

	@Before("doOperation()")
	public void beforeJoinpoint() {
		System.out.println("Transaction started with before join-point ");
	}

	@After("doOperation()")
	public void afterJoinpoint() {
		System.out.println("Transaction ended with After join-point");
	}

	@AfterReturning("doOperation()")
	public void afterThrowingJoinpoint() {
		System.out.println("Transaction completed with  no exception trace");
	}
}
