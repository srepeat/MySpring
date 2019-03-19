package com.atguigu.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyLogAspect {
	
	@Pointcut("public int com.atguigu.aop.MyDivision.*(..)")
	public void poinCut() {
		
	}

	@Before("poinCut()")
	public void logStart() {
		System.out.println("MyLogAspect......logStart..‘À––¡À");
	}
	
	@After("poinCut()")
	public void logEnd() {
		
	}
	
	@AfterReturning(value="poinCut()")
	public void logReturn() {
		
	}
	
	@AfterThrowing(value="poinCut()")
	public void logException() {
		
	}
}
